/**
 * 
 */
package com.ouyang.report.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.engine.export.JRHtmlExporterParameter;

import org.apache.struts2.ServletActionContext;

import cn.net.sinodata.bextension.shcm.module.ReportBean;

import com.ouyang.common.action.OymsAction;

/**
 * @Description TODO(用一句话描述功能)
 * @author 欧阳琼
 * 2013-9-3
 */
public class JasperAction  extends OymsAction{
	private static final long serialVersionUID = 8776799974272595602L;
	private ReportBean reportBean;
	public String toPDFReport() throws IOException{
		String jrxmlPath=this.getClass().getResource("/template/jrxml/acmsReport.jrxml").getPath();
		//File parent=new File(jrxmlPath).getParentFile().getParentFile().getParentFile();
		try {
			reportBean=new ReportBean();
			reportBean.setCustomerId("B标签客户全称");
			reportBean.setCusNm("B标签客户全称");
			reportBean.setOfficePhone("B标签 公司电话");
			reportBean.setRegAdd("B标签注册地址");
			reportBean.setStreet("B标签联系地址");
			reportBean.setPostCode("B标签邮政编码");
			reportBean.setRegAddPostCode("B标签注册地址邮编");
			reportBean.setDepositorTy("B标签存款人类别");
			reportBean.setLegalId("A标签证件号码");
			reportBean.setAcOrgMatDate(new Date());//A标签证件到期日
			reportBean.setLegalPerso1("D标签姓名");
			reportBean.setLegReare("D标签证件种类");//D标签证件种类
			reportBean.setLegalTelNo("J法人代表联系电话");//J法人代表联系电话
			reportBean.setLegalRepreId("D法人代表证件号码");//D法人代表证件号码
			reportBean.setAcLegMatDate(new Date());//D（法定代表人 ）证件到期日(帐号表)
			reportBean.setLegalMobilePhone("J法人手机");//J法人手机
			reportBean.setCapCurr("B注册币种");//B注册币种
			reportBean.setCapReg("B注册资本");//B注册资本
			reportBean.setNoOfRegAddCode("B注册地代码的数字部分");//B注册地代码的数字部分
			reportBean.setScopeOfBus("B标签经营范围");//B标签经营范围
			reportBean.setRegType("B注册类型");//B注册类型
			reportBean.setRegId("B注册登记号");//B注册登记号
			reportBean.setAcRegMatDate(new Date());//B注册证明文件有效期(帐号表)
			reportBean.setProveFileSecCategray("证明文件2种类");//B标签(证明文件2种类)
			reportBean.setProveFileSecNo("证明文件2编号");//B标签(证明文件2编号)
			reportBean.setProveFileSecValidDate("证明文件2有效期");//B标签(证明文件2有效期)
			reportBean.setCntyTaxRegNo("C国税登记号");//C国税登记号(如果为0则不打印）
			reportBean.setCityTaxRegNo("C地税登记号");//C地税登记号
			reportBean.setGeneralAccTag("√");
			reportBean.setBasicAccTag("√");
			reportBean.setSpecialAccTag("√");
			reportBean.setTempAccTag("√");
			reportBean.setSpecAcctFlag("A专用存款账户资金性质");//A专用存款账户资金性质
			reportBean.setMaturityDate(new Date());//K账户到期日(临时户必输入)
			reportBean.setCfoNameCfoId("J财务主管姓名+财务主管证件号");//J财务主管姓名+财务主管证件号
			reportBean.setCfoTelNo("J财务主管电话");//J财务主管电话
			reportBean.setCfoMobilePhone("J财务主管手机");//J财务主管手机
			reportBean.setParentcompany("I上级主管单位");//I上级主管单位
			reportBean.setPerCodePrAc("I基本账户开户");//I基本账户开户
			reportBean.setPcoLegalId("I组织机构代码");//I组织机构代码
			reportBean.setPcoLegalPersonNm("I单位负责人姓名");//I单位负责人姓名
			reportBean.setPcoLegalPerType("I单位负责人证件种类");//I单位负责人证件种类
			reportBean.setPcoLegalPerId("I单位负责人证件号码");//I单位负责人证件号码
			reportBean.setOrgno("K网点号");//K网点号(帐号表)
			reportBean.setBankNo("K标签网点号对应的12位行号");//K标签网点号对应的12位行号
			reportBean.setAccountTitle("K账号名称");//K账号名称(帐号表)一录没有这个字段
			reportBean.setBasicCode("F基本账户许可证号");   //F基本账户许可证号
			reportBean.setCurrentDate(new Date());//系统当前日期
			
			ArrayList<ReportBean>  list=new ArrayList<ReportBean>();
			list.add(reportBean);
			JRDataSource ds=new JRBeanCollectionDataSource(list);
			JasperReport jasperReport=JasperCompileManager.compileReport(jrxmlPath);
			
			JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport,null,ds);
			
			HttpServletResponse response=ServletActionContext.getResponse();
			JRHtmlExporter exporter = new JRHtmlExporter();
			exporter.setParameter(JRHtmlExporterParameter.JASPER_PRINT,jasperPrint);
			exporter.setParameter(JRHtmlExporterParameter.OUTPUT_WRITER,response.getWriter());
			exporter.setParameter(JRHtmlExporterParameter.IS_USING_IMAGES_TO_ALIGN,Boolean.FALSE);
			exporter.setParameter(JRExporterParameter.CHARACTER_ENCODING, "GBK");
			exporter.exportReport();
			
//			out.close();
//           JRPdfExporter exporter = new JRPdfExporter();  
//           exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
//           exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, response.getOutputStream());
//           response.setHeader("Content-Disposition", "attachment;filename=first.pdf");
//           response.setContentType("application/pdf"); 
//           exporter.exportReport();
//			File f=new File(parent,"template/jasper/acmsReport.jasper");
//			JasperCompileManager.compileReportToFile(jrxmlPath,f.getAbsolutePath()); 
		} catch (JRException e) {
			e.printStackTrace();
		}
		return null;
	}
}
