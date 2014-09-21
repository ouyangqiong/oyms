/**
 * 
 */
package cn.net.sinodata.bextension.shcm.module;

import java.util.Date;

/**
 * @Description TODO(用一句话描述功能)
 * @author 欧阳琼
 * 2013-9-5
 */
public class ReportBean {
	private String customerId;//客户号
	private String cusNm;//客户全称
	private String officePhone;//公司电话
	private String regAdd;//注册地址
	private String street;//B标签联系地址
	private String postCode;//B标签邮政编码
	private String regAddPostCode;//B标签(注册地址邮编)
	private String depositorTy;//B标签存款人类别
	private String legalId;//A标签证件号码
	private Date acOrgMatDate;//A标签证件到期日(帐号表)
	private String legalPerso1;//D标签姓名
	private String legReare;//D标签证件种类
	private String legalTelNo;//J法人代表联系电话
	private String legalRepreId;//D法人代表证件号码
	private Date   acLegMatDate;//D（法定代表人 ）证件到期日(帐号表)
	private String legalMobilePhone;//J法人手机
	private String capCurr;//B注册币种
	private String capReg;//B注册资本
	private String noOfRegAddCode;//B注册地代码的数字部分
	private String scopeOfBus;//B标签经营范围
	private String regType;//B注册类型
	private String regId;//B注册登记号
	private Date acRegMatDate;//B注册证明文件有效期(帐号表)
	private String proveFileSecCategray;//B标签(证明文件2种类)
	private String proveFileSecNo;//B标签(证明文件2编号)
	private String proveFileSecValidDate;//B标签(证明文件2有效期)
	private String cntyTaxRegNo;//C国税登记号(如果为0则不打印）
	private String cityTaxRegNo;//C地税登记号
	private String specAcctFlag;//A专用存款账户资金性质
	private Date maturityDate;//K账户到期日(临时户必输入)
	private String cfoNameCfoId;//J财务主管姓名+财务主管证件号
	private String cfoTelNo;//J财务主管电话
	private String cfoMobilePhone;//J财务主管手机
	private String parentcompany;//I上级主管单位
	private String perCodePrAc;//I基本账户开户
	private String pcoLegalId;//I组织机构代码
	private String pcoLegalPersonNm;//I单位负责人姓名
	private String pcoLegalPerType;//I单位负责人证件种类
	private String pcoLegalPerId;//I单位负责人证件号码
	private String orgno;//K网点号(帐号表)
	private String bankNo;//K标签网点号对应的12位行号
	private String accountTitle;//K账号名称(帐号表)一录没有这个字段
	private String basicCode;   //F基本账户许可证号
	private Date  currentDate;//系统当前日期
	private String basicAccTag; //基本存款账户
	private String generalAccTag;//一般存款账户
	private String specialAccTag;//专用存款账户
	private String tempAccTag;//临时存款账户
	
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCusNm() {
		return cusNm;
	}
	public void setCusNm(String cusNm) {
		this.cusNm = cusNm;
	}
	public String getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	public String getRegAdd() {
		return regAdd;
	}
	public void setRegAdd(String regAdd) {
		this.regAdd = regAdd;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getRegAddPostCode() {
		return regAddPostCode;
	}
	public void setRegAddPostCode(String regAddPostCode) {
		this.regAddPostCode = regAddPostCode;
	}
	public String getDepositorTy() {
		return depositorTy;
	}
	public void setDepositorTy(String depositorTy) {
		this.depositorTy = depositorTy;
	}
	public String getLegalId() {
		return legalId;
	}
	public void setLegalId(String legalId) {
		this.legalId = legalId;
	}
	public Date getAcOrgMatDate() {
		return acOrgMatDate;
	}
	public void setAcOrgMatDate(Date acOrgMatDate) {
		this.acOrgMatDate = acOrgMatDate;
	}
	public String getProveFileSecCategray() {
		return proveFileSecCategray;
	}
	public void setProveFileSecCategray(String proveFileSecCategray) {
		this.proveFileSecCategray = proveFileSecCategray;
	}
	public String getProveFileSecNo() {
		return proveFileSecNo;
	}
	public void setProveFileSecNo(String proveFileSecNo) {
		this.proveFileSecNo = proveFileSecNo;
	}
	public String getProveFileSecValidDate() {
		return proveFileSecValidDate;
	}
	public void setProveFileSecValidDate(String proveFileSecValidDate) {
		this.proveFileSecValidDate = proveFileSecValidDate;
	}
	public String getCfoMobilePhone() {
		return cfoMobilePhone;
	}
	public void setCfoMobilePhone(String cfoMobilePhone) {
		this.cfoMobilePhone = cfoMobilePhone;
	}
	public String getLegalMobilePhone() {
		return legalMobilePhone;
	}
	public void setLegalMobilePhone(String legalMobilePhone) {
		this.legalMobilePhone = legalMobilePhone;
	}
	public String getLegalPerso1() {
		return legalPerso1;
	}
	public void setLegalPerso1(String legalPerso1) {
		this.legalPerso1 = legalPerso1;
	}
	public String getLegReare() {
		return legReare;
	}
	public void setLegReare(String legReare) {
		this.legReare = legReare;
	}
	public String getLegalTelNo() {
		return legalTelNo;
	}
	public void setLegalTelNo(String legalTelNo) {
		this.legalTelNo = legalTelNo;
	}
	public String getLegalRepreId() {
		return legalRepreId;
	}
	public void setLegalRepreId(String legalRepreId) {
		this.legalRepreId = legalRepreId;
	}
	public Date getAcLegMatDate() {
		return acLegMatDate;
	}
	public void setAcLegMatDate(Date acLegMatDate) {
		this.acLegMatDate = acLegMatDate;
	}
	public String getCapCurr() {
		return capCurr;
	}
	public void setCapCurr(String capCurr) {
		this.capCurr = capCurr;
	}
	public String getCapReg() {
		return capReg;
	}
	public void setCapReg(String capReg) {
		this.capReg = capReg;
	}
	
	public String getNoOfRegAddCode() {
		return noOfRegAddCode;
	}
	public void setNoOfRegAddCode(String noOfRegAddCode) {
		this.noOfRegAddCode = noOfRegAddCode;
	}
	public String getScopeOfBus() {
		return scopeOfBus;
	}
	public void setScopeOfBus(String scopeOfBus) {
		this.scopeOfBus = scopeOfBus;
	}
	public String getRegType() {
		return regType;
	}
	public void setRegType(String regType) {
		this.regType = regType;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public Date getAcRegMatDate() {
		return acRegMatDate;
	}
	public void setAcRegMatDate(Date acRegMatDate) {
		this.acRegMatDate = acRegMatDate;
	}
	public String getCntyTaxRegNo() {
		return cntyTaxRegNo;
	}
	public void setCntyTaxRegNo(String cntyTaxRegNo) {
		this.cntyTaxRegNo = cntyTaxRegNo;
	}
	public String getCityTaxRegNo() {
		return cityTaxRegNo;
	}
	public void setCityTaxRegNo(String cityTaxRegNo) {
		this.cityTaxRegNo = cityTaxRegNo;
	}
	public String getSpecAcctFlag() {
		return specAcctFlag;
	}
	public void setSpecAcctFlag(String specAcctFlag) {
		this.specAcctFlag = specAcctFlag;
	}
	public Date getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}
	public String getCfoNameCfoId() {
		return cfoNameCfoId;
	}
	public void setCfoNameCfoId(String cfoNameCfoId) {
		this.cfoNameCfoId = cfoNameCfoId;
	}
	public String getCfoTelNo() {
		return cfoTelNo;
	}
	public void setCfoTelNo(String cfoTelNo) {
		this.cfoTelNo = cfoTelNo;
	}
	public String getParentcompany() {
		return parentcompany;
	}
	public void setParentcompany(String parentcompany) {
		this.parentcompany = parentcompany;
	}
	public String getPerCodePrAc() {
		return perCodePrAc;
	}
	public void setPerCodePrAc(String perCodePrAc) {
		this.perCodePrAc = perCodePrAc;
	}
	public String getPcoLegalId() {
		return pcoLegalId;
	}
	public void setPcoLegalId(String pcoLegalId) {
		this.pcoLegalId = pcoLegalId;
	}
	public String getPcoLegalPersonNm() {
		return pcoLegalPersonNm;
	}
	public void setPcoLegalPersonNm(String pcoLegalPersonNm) {
		this.pcoLegalPersonNm = pcoLegalPersonNm;
	}
	public String getPcoLegalPerType() {
		return pcoLegalPerType;
	}
	public void setPcoLegalPerType(String pcoLegalPerType) {
		this.pcoLegalPerType = pcoLegalPerType;
	}
	public String getPcoLegalPerId() {
		return pcoLegalPerId;
	}
	public void setPcoLegalPerId(String pcoLegalPerId) {
		this.pcoLegalPerId = pcoLegalPerId;
	}
	public String getOrgno() {
		return orgno;
	}
	public void setOrgno(String orgno) {
		this.orgno = orgno;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getAccountTitle() {
		return accountTitle;
	}
	public void setAccountTitle(String accountTitle) {
		this.accountTitle = accountTitle;
	}
	public String getBasicCode() {
		return basicCode;
	}
	public void setBasicCode(String basicCode) {
		this.basicCode = basicCode;
	}
	public Date getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	public String getBasicAccTag() {
		return basicAccTag;
	}
	public void setBasicAccTag(String basicAccTag) {
		this.basicAccTag = basicAccTag;
	}
	public String getGeneralAccTag() {
		return generalAccTag;
	}
	public void setGeneralAccTag(String generalAccTag) {
		this.generalAccTag = generalAccTag;
	}
	public String getSpecialAccTag() {
		return specialAccTag;
	}
	public void setSpecialAccTag(String specialAccTag) {
		this.specialAccTag = specialAccTag;
	}
	public String getTempAccTag() {
		return tempAccTag;
	}
	public void setTempAccTag(String tempAccTag) {
		this.tempAccTag = tempAccTag;
	}
}
