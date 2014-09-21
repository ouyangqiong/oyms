package cn.net.sinodata.bextension.shcm.module;



import java.util.Date;

import org.apache.log4j.Logger;

/**
 * CmCustomer entity. @author MyEclipse Persistence Tools
 */

public class CmCustomer implements java.io.Serializable, Cloneable {

	public static final Logger log=Logger.getLogger(CmCustomer.class);
	// Fields

	private String cusId;//只是主键
	private String customerId;//客户号（开户新建不存在，反之存在）
	private String cusNm;//客户全称
	private String shortNm;//简名
	private String mnemonic;//助记名
	private String street;//联系地址
	private String postCode;//邮政编码
	private String officePhone;//公司电话
	private String phone;
	private String legalEntTyp;//证件类型
	private String legalId;//证件号码
	private String legalIdDate;
	private String sector;//客户类别
	private String secTraderCode;//券商代码
	private String industry;//行业代码
	private String accountOfficer;//客户经理
	private String depositorTy;//存款人类别
	private String cntyTaxRegNo;//国税登记号
	private Date cntyTaxRegDate;//国税登记到期日
	private String cityTaxRegNo;//地税登记号
	private Date cityTaxRegDate;//地税登记到期日
	private String loanCardNo;//贷款卡号
	private String perCodePrAc;//基本账户开户
	private String scopeOfBus;//经营范围
	private String regAddCode;//注册地代码
	private String regType;//注册类型
	private String regId;//注册登记号
	private String regAdd;//注册地址
	private String legalPerso;//法人代表姓名
	private String legReare;//法人代表证件种类
	private String legalRepreId;//法人代表证件号码
	private String legalTelNo;//法人代表联系电话
	private String parentcompany;//上级主管单位
	private String pcoAcPerCode;//基本账户开户登记证核准号
	private String pcoLegalType;//组织机构种类
	private String pcoLegalPersonNm;//单位负责人姓名
	private String pcoLegalPerType;//单位负责人证件种类
	private String pcoLegalPerId;//单位负责人证件号码
	private String capCurr;//注册币种
	private String capReg;//注册资本
	private String capRecPer;//实收资本
	private String cfoName;//财务主管姓名
	private String cfoIdType;//财务主管证件种类
	private String cfoId;//财务主管证件号
	private String cfoTelNo;//财务主管电话
	private String cfoAddress;//财务主管地址
	private String cfoPostCode;//财务主管邮编
	private String instCredtCode;//机构信用代码
	private String cusContriType;//客户出资人性质
	private String fbId;
	private String ftTxnType;
	private String feebaseLogId;
	private String nationality;//国籍代码
	private String residence;//居住地所在国家
	private String mainPercent;//客户经理比例
	private String target;//目标客户分类
	private String customerStatus;//客户等级
	private String medSmEntFlg;//企业规模
	private String city;//所在城市
	private String pcoLegalId;//组织机构代码
	private String centno;
	private String coCode;
	private String inputter;
	private Date processingDate;
	private String cusStt;
	private String proveType;
	private String proveNo;//证明文件编号(一般户)
	private String proveType1;
	private String proveNo1;
	private String cusEnNm;
	private String gbShortNm;
	private String gbStreet;
	private String legalDealResult;//法定代表人联网查询返回结果
	private String legalPassFlag;//法定代表人联网查询自选结果
	private String agentDealResult;//代理人联网查询返回结果
	private String agentPassFlag;//代理人人联网查询自选结果
	private String agentTelNo;//代理人手机号码
	//add by oyq 2013094
	private String regAddPostCode;//B标签(注册地址邮编)
	private String proveFileSecCategray;//B标签(证明文件2种类)
	private String proveFileSecNo;//B标签(证明文件2编号)
	private String proveFileSecValidDate;//B标签(证明文件2有效期)
	private String cfoMobilePhone;//财务主管手机
	private String legalMobilePhone;//法人手机
	//add by oyq 2013094

	/*
	 * 新添加
	 */
	private String basicCode;   //基本账户许可证号
	private String pcoLegalDate;  //(非)组织机构代码证

	// Constructors

	/** default constructor */
	public CmCustomer() {
	}

	/** minimal constructor */
	public CmCustomer(String cusNm, String shortNm, String mnemonic,
			String street, String postCode, String officePhone,
			String legalEntTyp, String legalId, String sector, String industry,
			String accountOfficer, String regAddCode, String regType,
			String regId, String legalPerso, String legReare,
			String legalRepreId, String legalTelNo, String cfoName,
			String cfoTelNo, String fbId, String ftTxnType,
			String feebaseLogId, String nationality, String residence,
			String mainPercent, String target, String customerStatus,
			String medSmEntFlg, String inputter, Date processingDate) {
		this.cusNm = cusNm;
		this.shortNm = shortNm;
		this.mnemonic = mnemonic;
		this.street = street;
		this.postCode = postCode;
		this.officePhone = officePhone;
		this.legalEntTyp = legalEntTyp;
		this.legalId = legalId;
		this.sector = sector;
		this.industry = industry;
		this.accountOfficer = accountOfficer;
		this.regAddCode = regAddCode;
		this.regType = regType;
		this.regId = regId;
		this.legalPerso = legalPerso;
		this.legReare = legReare;
		this.legalRepreId = legalRepreId;
		this.legalTelNo = legalTelNo;
		this.cfoName = cfoName;
		this.cfoTelNo = cfoTelNo;
		this.fbId = fbId;
		this.ftTxnType = ftTxnType;
		this.feebaseLogId = feebaseLogId;
		this.nationality = nationality;
		this.residence = residence;
		this.mainPercent = mainPercent;
		this.target = target;
		this.customerStatus = customerStatus;
		this.medSmEntFlg = medSmEntFlg;
		this.inputter = inputter;
		this.processingDate = processingDate;
	}

	/** full constructor */
	public CmCustomer(String customerId, String cusNm, String shortNm,
			String mnemonic, String street, String postCode,
			String officePhone, String phone, String legalEntTyp,
			String legalId, String legalIdDate, String sector,
			String secTraderCode, String industry, String accountOfficer,
			String depositorTy, String cntyTaxRegNo, Date cntyTaxRegDate,
			String cityTaxRegNo, Date cityTaxRegDate, String loanCardNo,
			String perCodePrAc, String scopeOfBus, String regAddCode,
			String regType, String regId, String regAdd, String legalPerso,
			String legReare, String legalRepreId, String legalTelNo,
			String parentcompany, String pcoAcPerCode, String pcoLegalType,
			String pcoLegalPersonNm, String pcoLegalPerType,
			String pcoLegalPerId, String capCurr, String capReg,
			String capRecPer, String cfoName, String cfoIdType, String cfoId,
			String cfoTelNo, String cfoAddress, String cfoPostCode,
			String instCredtCode, String cusContriType, String fbId,
			String ftTxnType, String feebaseLogId, String nationality,
			String residence, String mainPercent, String target,
			String customerStatus, String medSmEntFlg, String city,
			String pcoLegalId, String centno, String coCode, String inputter,
			Date processingDate, String cusStt, String proveType,
			String proveNo, String proveType1, String proveNo1) {
		this.customerId = customerId;
		this.cusNm = cusNm;
		this.shortNm = shortNm;
		this.mnemonic = mnemonic;
		this.street = street;
		this.postCode = postCode;
		this.officePhone = officePhone;
		this.phone = phone;
		this.legalEntTyp = legalEntTyp;
		this.legalId = legalId;
		this.legalIdDate = legalIdDate;
		this.sector = sector;
		this.secTraderCode = secTraderCode;
		this.industry = industry;
		this.accountOfficer = accountOfficer;
		this.depositorTy = depositorTy;
		this.cntyTaxRegNo = cntyTaxRegNo;
		this.cntyTaxRegDate = cntyTaxRegDate;
		this.cityTaxRegNo = cityTaxRegNo;
		this.cityTaxRegDate = cityTaxRegDate;
		this.loanCardNo = loanCardNo;
		this.perCodePrAc = perCodePrAc;
		this.scopeOfBus = scopeOfBus;
		this.regAddCode = regAddCode;
		this.regType = regType;
		this.regId = regId;
		this.regAdd = regAdd;
		this.legalPerso = legalPerso;
		this.legReare = legReare;
		this.legalRepreId = legalRepreId;
		this.legalTelNo = legalTelNo;
		this.parentcompany = parentcompany;
		this.pcoAcPerCode = pcoAcPerCode;
		this.pcoLegalType = pcoLegalType;
		this.pcoLegalPersonNm = pcoLegalPersonNm;
		this.pcoLegalPerType = pcoLegalPerType;
		this.pcoLegalPerId = pcoLegalPerId;
		this.capCurr = capCurr;
		this.capReg = capReg;
		this.capRecPer = capRecPer;
		this.cfoName = cfoName;
		this.cfoIdType = cfoIdType;
		this.cfoId = cfoId;
		this.cfoTelNo = cfoTelNo;
		this.cfoAddress = cfoAddress;
		this.cfoPostCode = cfoPostCode;
		this.instCredtCode = instCredtCode;
		this.cusContriType = cusContriType;
		this.fbId = fbId;
		this.ftTxnType = ftTxnType;
		this.feebaseLogId = feebaseLogId;
		this.nationality = nationality;
		this.residence = residence;
		this.mainPercent = mainPercent;
		this.target = target;
		this.customerStatus = customerStatus;
		this.medSmEntFlg = medSmEntFlg;
		this.city = city;
		this.pcoLegalId = pcoLegalId;
		this.centno = centno;
		this.coCode = coCode;
		this.inputter = inputter;
		this.processingDate = processingDate;
		this.cusStt = cusStt;
		this.proveType = proveType;
		this.proveNo = proveNo;
		this.proveType1 = proveType1;
		this.proveNo1 = proveNo1;
	}

	 public Object clone(){ 
	    	CmCustomer o = null; 
	    	try{ 
	    	o = (CmCustomer)super.clone(); 
	    	}catch(CloneNotSupportedException e){ 
	    		log.info("clone"+e.getMessage(),e);
	    	} 
	    	return o; 
	    	} 
	// Property accessors

	 
	 
	public String getCusId() {
		return this.cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}
	public String getLegalDealResult() {
		return legalDealResult;
	}

	public void setLegalDealResult(String legalDealResult) {
		this.legalDealResult = legalDealResult;
	}

	public String getLegalPassFlag() {
		return legalPassFlag;
	}

	public void setLegalPassFlag(String legalPassFlag) {
		this.legalPassFlag = legalPassFlag;
	}

	public String getAgentDealResult() {
		return agentDealResult;
	}

	public void setAgentDealResult(String agentDealResult) {
		this.agentDealResult = agentDealResult;
	}

	public String getAgentPassFlag() {
		return agentPassFlag;
	}

	public void setAgentPassFlag(String agentPassFlag) {
		this.agentPassFlag = agentPassFlag;
	}

	public String getBasicCode() {
		return basicCode;
	}

	public void setBasicCode(String basicCode) {
		this.basicCode = basicCode;
	}

	public String getPcoLegalDate() {
		return pcoLegalDate;
	}

	public void setPcoLegalDate(String pcoLegalDate) {
		this.pcoLegalDate = pcoLegalDate;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCusNm() {
		return this.cusNm;
	}

	public void setCusNm(String cusNm) {
		this.cusNm = cusNm;
	}

	public String getShortNm() {
		return this.shortNm;
	}

	public void setShortNm(String shortNm) {
		this.shortNm = shortNm;
	}

	public String getMnemonic() {
		return this.mnemonic;
	}

	public void setMnemonic(String mnemonic) {
		this.mnemonic = mnemonic;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getOfficePhone() {
		return this.officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLegalEntTyp() {
		return this.legalEntTyp;
	}

	public void setLegalEntTyp(String legalEntTyp) {
		this.legalEntTyp = legalEntTyp;
	}

	public String getLegalId() {
		return this.legalId;
	}

	public void setLegalId(String legalId) {
		this.legalId = legalId;
	}

	public String getLegalIdDate() {
		return this.legalIdDate;
	}

	public void setLegalIdDate(String legalIdDate) {
		this.legalIdDate = legalIdDate;
	}

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getSecTraderCode() {
		return this.secTraderCode;
	}

	public void setSecTraderCode(String secTraderCode) {
		this.secTraderCode = secTraderCode;
	}

	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getAccountOfficer() {
		return this.accountOfficer;
	}

	public void setAccountOfficer(String accountOfficer) {
		this.accountOfficer = accountOfficer;
	}

	public String getDepositorTy() {
		return this.depositorTy;
	}

	public void setDepositorTy(String depositorTy) {
		this.depositorTy = depositorTy;
	}

	public String getCntyTaxRegNo() {
		return this.cntyTaxRegNo;
	}

	public void setCntyTaxRegNo(String cntyTaxRegNo) {
		this.cntyTaxRegNo = cntyTaxRegNo;
	}

	public Date getCntyTaxRegDate() {
		return this.cntyTaxRegDate;
	}

	public void setCntyTaxRegDate(Date cntyTaxRegDate) {
		this.cntyTaxRegDate = cntyTaxRegDate;
	}

	public String getCityTaxRegNo() {
		return this.cityTaxRegNo;
	}

	public void setCityTaxRegNo(String cityTaxRegNo) {
		this.cityTaxRegNo = cityTaxRegNo;
	}

	public Date getCityTaxRegDate() {
		return this.cityTaxRegDate;
	}

	public void setCityTaxRegDate(Date cityTaxRegDate) {
		this.cityTaxRegDate = cityTaxRegDate;
	}

	public String getLoanCardNo() {
		return this.loanCardNo;
	}

	public void setLoanCardNo(String loanCardNo) {
		this.loanCardNo = loanCardNo;
	}

	public String getPerCodePrAc() {
		return this.perCodePrAc;
	}

	public void setPerCodePrAc(String perCodePrAc) {
		this.perCodePrAc = perCodePrAc;
	}

	public String getScopeOfBus() {
		return this.scopeOfBus;
	}

	public void setScopeOfBus(String scopeOfBus) {
		this.scopeOfBus = scopeOfBus;
	}

	public String getRegAddCode() {
		return this.regAddCode;
	}

	public void setRegAddCode(String regAddCode) {
		this.regAddCode = regAddCode;
	}

	public String getRegType() {
		return this.regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
	}

	public String getRegId() {
		return this.regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public String getRegAdd() {
		return this.regAdd;
	}

	public void setRegAdd(String regAdd) {
		this.regAdd = regAdd;
	}

	public String getLegalPerso() {
		return this.legalPerso;
	}

	public void setLegalPerso(String legalPerso) {
		this.legalPerso = legalPerso;
	}

	public String getLegReare() {
		return this.legReare;
	}

	public void setLegReare(String legReare) {
		this.legReare = legReare;
	}

	public String getLegalRepreId() {
		return this.legalRepreId;
	}

	public void setLegalRepreId(String legalRepreId) {
		this.legalRepreId = legalRepreId;
	}

	public String getLegalTelNo() {
		return this.legalTelNo;
	}

	public void setLegalTelNo(String legalTelNo) {
		this.legalTelNo = legalTelNo;
	}

	public String getParentcompany() {
		return this.parentcompany;
	}

	public void setParentcompany(String parentcompany) {
		this.parentcompany = parentcompany;
	}

	public String getPcoAcPerCode() {
		return this.pcoAcPerCode;
	}

	public void setPcoAcPerCode(String pcoAcPerCode) {
		this.pcoAcPerCode = pcoAcPerCode;
	}

	public String getPcoLegalType() {
		return this.pcoLegalType;
	}

	public void setPcoLegalType(String pcoLegalType) {
		this.pcoLegalType = pcoLegalType;
	}

	public String getPcoLegalPersonNm() {
		return this.pcoLegalPersonNm;
	}

	public void setPcoLegalPersonNm(String pcoLegalPersonNm) {
		this.pcoLegalPersonNm = pcoLegalPersonNm;
	}

	public String getPcoLegalPerType() {
		return this.pcoLegalPerType;
	}

	public void setPcoLegalPerType(String pcoLegalPerType) {
		this.pcoLegalPerType = pcoLegalPerType;
	}

	public String getPcoLegalPerId() {
		return this.pcoLegalPerId;
	}

	public void setPcoLegalPerId(String pcoLegalPerId) {
		this.pcoLegalPerId = pcoLegalPerId;
	}

	public String getCapCurr() {
		return this.capCurr;
	}

	public void setCapCurr(String capCurr) {
		this.capCurr = capCurr;
	}

	public String getCapReg() {
		return this.capReg;
	}

	public void setCapReg(String capReg) {
		this.capReg = capReg;
	}

	public String getCapRecPer() {
		return this.capRecPer;
	}

	public void setCapRecPer(String capRecPer) {
		this.capRecPer = capRecPer;
	}

	public String getCfoName() {
		return this.cfoName;
	}

	public void setCfoName(String cfoName) {
		this.cfoName = cfoName;
	}

	public String getCfoIdType() {
		return this.cfoIdType;
	}

	public void setCfoIdType(String cfoIdType) {
		this.cfoIdType = cfoIdType;
	}

	public String getCfoId() {
		return this.cfoId;
	}

	public void setCfoId(String cfoId) {
		this.cfoId = cfoId;
	}

	public String getCfoTelNo() {
		return this.cfoTelNo;
	}

	public void setCfoTelNo(String cfoTelNo) {
		this.cfoTelNo = cfoTelNo;
	}

	public String getCfoAddress() {
		return this.cfoAddress;
	}

	public void setCfoAddress(String cfoAddress) {
		this.cfoAddress = cfoAddress;
	}

	public String getCfoPostCode() {
		return this.cfoPostCode;
	}

	public void setCfoPostCode(String cfoPostCode) {
		this.cfoPostCode = cfoPostCode;
	}

	public String getInstCredtCode() {
		return this.instCredtCode;
	}

	public void setInstCredtCode(String instCredtCode) {
		this.instCredtCode = instCredtCode;
	}

	public String getCusContriType() {
		return this.cusContriType;
	}

	public void setCusContriType(String cusContriType) {
		this.cusContriType = cusContriType;
	}

	public String getFbId() {
		return this.fbId;
	}

	public void setFbId(String fbId) {
		this.fbId = fbId;
	}

	public String getFtTxnType() {
		return this.ftTxnType;
	}

	public void setFtTxnType(String ftTxnType) {
		this.ftTxnType = ftTxnType;
	}

	public String getFeebaseLogId() {
		return this.feebaseLogId;
	}

	public void setFeebaseLogId(String feebaseLogId) {
		this.feebaseLogId = feebaseLogId;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getResidence() {
		return this.residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getMainPercent() {
		return this.mainPercent;
	}

	public void setMainPercent(String mainPercent) {
		this.mainPercent = mainPercent;
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getCustomerStatus() {
		return this.customerStatus;
	}

	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}

	public String getMedSmEntFlg() {
		return this.medSmEntFlg;
	}

	public void setMedSmEntFlg(String medSmEntFlg) {
		this.medSmEntFlg = medSmEntFlg;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPcoLegalId() {
		return this.pcoLegalId;
	}

	public void setPcoLegalId(String pcoLegalId) {
		this.pcoLegalId = pcoLegalId;
	}

	public String getCentno() {
		return this.centno;
	}

	public void setCentno(String centno) {
		this.centno = centno;
	}

	public String getCoCode() {
		return this.coCode;
	}

	public void setCoCode(String coCode) {
		this.coCode = coCode;
	}

	public String getInputter() {
		return this.inputter;
	}

	public void setInputter(String inputter) {
		this.inputter = inputter;
	}

	public Date getProcessingDate() {
		return this.processingDate;
	}

	public void setProcessingDate(Date processingDate) {
		this.processingDate = processingDate;
	}

	public String getCusStt() {
		return this.cusStt;
	}

	public void setCusStt(String cusStt) {
		this.cusStt = cusStt;
	}

	public String getProveType() {
		return this.proveType;
	}

	public void setProveType(String proveType) {
		this.proveType = proveType;
	}

	public String getProveNo() {
		return this.proveNo;
	}

	public void setProveNo(String proveNo) {
		this.proveNo = proveNo;
	}

	public String getProveType1() {
		return this.proveType1;
	}

	public void setProveType1(String proveType1) {
		this.proveType1 = proveType1;
	}

	public String getProveNo1() {
		return this.proveNo1;
	}

	public void setProveNo1(String proveNo1) {
		this.proveNo1 = proveNo1;
	}

	public String getCusEnNm() {
		return cusEnNm;
	}

	public void setCusEnNm(String cusEnNm) {
		this.cusEnNm = cusEnNm;
	}

	public String getGbShortNm() {
		return gbShortNm;
	}

	public void setGbShortNm(String gbShortNm) {
		this.gbShortNm = gbShortNm;
	}

	public String getGbStreet() {
		return gbStreet;
	}

	public void setGbStreet(String gbStreet) {
		this.gbStreet = gbStreet;
	}

	/**
	 * @return the agentTelNo
	 */
	public String getAgentTelNo() {
		return agentTelNo;
	}

	/**
	 * @param agentTelNo the agentTelNo to set
	 */
	public void setAgentTelNo(String agentTelNo) {
		this.agentTelNo = agentTelNo;
	}
	/**
	 * @return the regAddPostCode
	 */
	public String getRegAddPostCode() {
		return regAddPostCode;
	}

	/**
	 * @param regAddPostCode the regAddPostCode to set
	 */
	public void setRegAddPostCode(String regAddPostCode) {
		this.regAddPostCode = regAddPostCode;
	}

	/**
	 * @return the proveFileSecCatogray
	 */
	public String getProveFileSecCategray() {
		return proveFileSecCategray;
	}

	/**
	 * @param proveFileSecCatogray the proveFileSecCatogray to set
	 */
	public void setProveFileSecCategray(String proveFileSecCategray) {
		this.proveFileSecCategray = proveFileSecCategray;
	}

	/**
	 * @return the proveFileSecNo
	 */
	public String getProveFileSecNo() {
		return proveFileSecNo;
	}

	/**
	 * @param proveFileSecNo the proveFileSecNo to set
	 */
	public void setProveFileSecNo(String proveFileSecNo) {
		this.proveFileSecNo = proveFileSecNo;
	}

	/**
	 * @return the proveFileSecValidDate
	 */
	public String getProveFileSecValidDate() {
		return proveFileSecValidDate;
	}

	/**
	 * @param proveFileSecValidDate the proveFileSecValidDate to set
	 */
	public void setProveFileSecValidDate(String proveFileSecValidDate) {
		this.proveFileSecValidDate = proveFileSecValidDate;
	}

	/**
	 * @return the cfoMobilePhone
	 */
	public String getCfoMobilePhone() {
		return cfoMobilePhone;
	}

	/**
	 * @param cfoMobilePhone the cfoMobilePhone to set
	 */
	public void setCfoMobilePhone(String cfoMobilePhone) {
		this.cfoMobilePhone = cfoMobilePhone;
	}

	/**
	 * @return the legalMobilePhone
	 */
	public String getLegalMobilePhone() {
		return legalMobilePhone;
	}

	/**
	 * @param legalMobilePhone the legalMobilePhone to set
	 */
	public void setLegalMobilePhone(String legalMobilePhone) {
		this.legalMobilePhone = legalMobilePhone;
	}
}