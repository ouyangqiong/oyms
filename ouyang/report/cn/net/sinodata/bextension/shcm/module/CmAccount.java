package cn.net.sinodata.bextension.shcm.module;

import java.util.Date;

import org.apache.log4j.Logger;

/**
 * CmAccount entity. @author MyEclipse Persistence Tools
 */

public class CmAccount implements java.io.Serializable, Cloneable {

	public static final Logger log=Logger.getLogger(CmAccount.class);
	// Fields
	private String acctId;//只是
	private String accountNo;//账号（变更，事后监督界面存在）
	private String acMode;//账户类型
	private String accountTitle;//账号名称
	private String customerId;/*客户表主键*/
	private String gategory;//类别代码
	private String accountTitle1;
	private String accountTitle2;
	private String shortTitle;//户名缩写
	private String currency;//币种
	private String accountOfficer;//客户经理（customer表中也有客户经理字段）
	private String mainOfficerPercent;//客户经理拓展系数
	private String acType;//账户性质（开户一录不显示，反之均显示）
	private String sealPassword;//印鉴密码标志
	private Date acOrgMatDate;//（基本信息）证件到期日
	private Date acRegMatDate;//注册证明文件有效期
	private Date acTaxMatDate;
	private Date acLegMatDate;//（法定代表人 ）证件到期日
	private String fcySpecActype;
	private String agentName;//代理人姓名
	private String agenLegalType;//代理人证件种类
	private String agentLegalId;//代理人证件号码
	private String specAcctFlag;//专用存款账户资金性质
	private String loanAcctFlag;//贷款专户
	private String closeRestrict;//清户限制
	private String primaryAcBrn;//基本账户开户行
	private String primaryAcNo;//基本账户账号
	private String waiveLedgerFee;//免账户维护费标志
	private String chequesAllowed;//允许使用支票
	private Date officialOpenDate;//PBOC核准日
	private Date accountEffDate;
	private Date maturityDate;//账户到期日(临时户必输入)
	private String fbId;
	private String ftTxnType;
	private String feebaseLogId;
	private String accountUsage;//账户用途
	private String secAcStatus;//证券公司帐户状态
	private Date secStatusDate;//证券公司预开/预清户日期
	private String fcyAprvlCrtf;//核准件号码
	private String safeDepLimccy;
	private Date safeDepEnd;
	private String NAcCharacter;
	private String interestLiquAcct;//利息清算账户
	private Date agreeEffDate;
	private String agreeAmt;
	private Date agreeEnd;
	private Long safeDepLimamt;
	private String uuid;//套好
	private String cancelReason;
	private String centno;
	private String orgno;//网点号
	private String postingRestrict;//界面没有:过账限制
	private String cashTxnFlg;
	private Date openingDate;//界面没有：账户开户日()
	private Date depValDate;
	private String term;//界面没有：存期
	private String acCharacter;
	private String charDiff;
	private String exchangeNo;//界面没有：交换号
	private String fcyType;//界面没有：外币类型（钞|汇）
	private String legalEntTyp;
	private String legalEntNo;
	private String inactivMarker;
	private Long openClearedBal;
	private Long onlineActualBal;
	private Long onlineClearedBal;
	private Long workingBalance;
	private String altAcctId;
	private String masterAccount;
	private String coCode;
	private String acctStt;
	private String inputter;
	private Date processingDate;
	private String alarmFlag;

	// Constructors

	/** default constructor */
	public CmAccount() {
	}

	/** minimal constructor */
	public CmAccount(String acMode, String accountTitle1, String shortTitle,
			String accountOfficer, String mainOfficerPercent,
			Date acOrgMatDate, Date acRegMatDate, Date acLegMatDate,
			String fbId, String ftTxnType, String feebaseLogId) {
		this.acMode = acMode;
		this.accountTitle1 = accountTitle1;
		this.shortTitle = shortTitle;
		this.accountOfficer = accountOfficer;
		this.mainOfficerPercent = mainOfficerPercent;
		this.acOrgMatDate = acOrgMatDate;
		this.acRegMatDate = acRegMatDate;
		this.acLegMatDate = acLegMatDate;
		this.fbId = fbId;
		this.ftTxnType = ftTxnType;
		this.feebaseLogId = feebaseLogId;
	}

	/** full constructor */
	public CmAccount(String accountNo, String acMode, String accountTitle,
			String customerId, String gategory, String accountTitle1,
			String accountTitle2, String shortTitle, String currency,
			String accountOfficer, String mainOfficerPercent, String acType,
			String sealPassword, Date acOrgMatDate, Date acRegMatDate,
			Date acTaxMatDate, Date acLegMatDate, String fcySpecActype,
			String agentName, String agenLegalType, String agentLegalId,
			String specAcctFlag, String loanAcctFlag, String closeRestrict,
			String primaryAcBrn, String primaryAcNo, String waiveLedgerFee,
			String chequesAllowed, Date officialOpenDate, Date accountEffDate,
			Date maturityDate, String fbId, String ftTxnType,
			String feebaseLogId, String accountUsage, String secAcStatus,
			Date secStatusDate, String fcyAprvlCrtf, String safeDepLimccy,
			Date safeDepEnd, String NAcCharacter, String interestLiquAcct,
			Date agreeEffDate, String agreeAmt, Date agreeEnd,
			Long safeDepLimamt, String uuid, String cancelReason,
			String centno, String orgno, String postingRestrict,
			String cashTxnFlg, Date openingDate, Date depValDate, String term,
			String acCharacter, String charDiff, String exchangeNo,
			String fcyType, String legalEntTyp, String legalEntNo,
			String inactivMarker, Long openClearedBal,
			Long onlineActualBal, Long onlineClearedBal,
			Long workingBalance, String altAcctId, String masterAccount,
			String coCode, String acctStt) {
		this.accountNo = accountNo;
		this.acMode = acMode;
		this.accountTitle = accountTitle;
		this.customerId = customerId;
		this.gategory = gategory;
		this.accountTitle1 = accountTitle1;
		this.accountTitle2 = accountTitle2;
		this.shortTitle = shortTitle;
		this.currency = currency;
		this.accountOfficer = accountOfficer;
		this.mainOfficerPercent = mainOfficerPercent;
		this.acType = acType;
		this.sealPassword = sealPassword;
		this.acOrgMatDate = acOrgMatDate;
		this.acRegMatDate = acRegMatDate;
		this.acTaxMatDate = acTaxMatDate;
		this.acLegMatDate = acLegMatDate;
		this.fcySpecActype = fcySpecActype;
		this.agentName = agentName;
		this.agenLegalType = agenLegalType;
		this.agentLegalId = agentLegalId;
		this.specAcctFlag = specAcctFlag;
		this.loanAcctFlag = loanAcctFlag;
		this.closeRestrict = closeRestrict;
		this.primaryAcBrn = primaryAcBrn;
		this.primaryAcNo = primaryAcNo;
		this.waiveLedgerFee = waiveLedgerFee;
		this.chequesAllowed = chequesAllowed;
		this.officialOpenDate = officialOpenDate;
		this.accountEffDate = accountEffDate;
		this.maturityDate = maturityDate;
		this.fbId = fbId;
		this.ftTxnType = ftTxnType;
		this.feebaseLogId = feebaseLogId;
		this.accountUsage = accountUsage;
		this.secAcStatus = secAcStatus;
		this.secStatusDate = secStatusDate;
		this.fcyAprvlCrtf = fcyAprvlCrtf;
		this.safeDepLimccy = safeDepLimccy;
		this.safeDepEnd = safeDepEnd;
		this.NAcCharacter = NAcCharacter;
		this.interestLiquAcct = interestLiquAcct;
		this.agreeEffDate = agreeEffDate;
		this.agreeAmt = agreeAmt;
		this.agreeEnd = agreeEnd;
		this.safeDepLimamt = safeDepLimamt;
		this.uuid = uuid;
		this.cancelReason = cancelReason;
		this.centno = centno;
		this.orgno = orgno;
		this.postingRestrict = postingRestrict;
		this.cashTxnFlg = cashTxnFlg;
		this.openingDate = openingDate;
		this.depValDate = depValDate;
		this.term = term;
		this.acCharacter = acCharacter;
		this.charDiff = charDiff;
		this.exchangeNo = exchangeNo;
		this.fcyType = fcyType;
		this.legalEntTyp = legalEntTyp;
		this.legalEntNo = legalEntNo;
		this.inactivMarker = inactivMarker;
		this.openClearedBal = openClearedBal;
		this.onlineActualBal = onlineActualBal;
		this.onlineClearedBal = onlineClearedBal;
		this.workingBalance = workingBalance;
		this.altAcctId = altAcctId;
		this.masterAccount = masterAccount;
		this.coCode = coCode;
		this.acctStt = acctStt;
	}
	 public Object clone(){ 
	    	CmAccount o = null; 
	    	try{ 
	    	o = (CmAccount)super.clone(); 
	    	}catch(CloneNotSupportedException e){ 
	    		log.info("clone"+e.getMessage(),e);
	    	} 
	    	return o; 
	    	} 

	// Property accessors

	public String getAcctId() {
		return this.acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAcMode() {
		return this.acMode;
	}

	public void setAcMode(String acMode) {
		this.acMode = acMode;
	}

	public String getAccountTitle() {
		return this.accountTitle;
	}

	public void setAccountTitle(String accountTitle) {
		this.accountTitle = accountTitle;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getGategory() {
		return this.gategory;
	}

	public void setGategory(String gategory) {
		this.gategory = gategory;
	}

	public String getAccountTitle1() {
		return this.accountTitle1;
	}

	public void setAccountTitle1(String accountTitle1) {
		this.accountTitle1 = accountTitle1;
	}

	public String getAccountTitle2() {
		return this.accountTitle2;
	}

	public void setAccountTitle2(String accountTitle2) {
		this.accountTitle2 = accountTitle2;
	}

	public String getShortTitle() {
		return this.shortTitle;
	}

	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAccountOfficer() {
		return this.accountOfficer;
	}

	public void setAccountOfficer(String accountOfficer) {
		this.accountOfficer = accountOfficer;
	}

	public String getMainOfficerPercent() {
		return this.mainOfficerPercent;
	}

	public void setMainOfficerPercent(String mainOfficerPercent) {
		this.mainOfficerPercent = mainOfficerPercent;
	}

	public String getAcType() {
		return this.acType;
	}

	public void setAcType(String acType) {
		this.acType = acType;
	}

	public String getSealPassword() {
		return this.sealPassword;
	}

	public void setSealPassword(String sealPassword) {
		this.sealPassword = sealPassword;
	}

	public Date getAcOrgMatDate() {
		return this.acOrgMatDate;
	}
	public void setAcOrgMatDate(Date acOrgMatDate) {
		this.acOrgMatDate = acOrgMatDate;
	}

	public Date getAcRegMatDate() {
		return this.acRegMatDate;
	}

	public void setAcRegMatDate(Date acRegMatDate) {
		this.acRegMatDate = acRegMatDate;
	}

	public Date getAcTaxMatDate() {
		return this.acTaxMatDate;
	}

	public void setAcTaxMatDate(Date acTaxMatDate) {
		this.acTaxMatDate = acTaxMatDate;
	}

	public Date getAcLegMatDate() {
		return this.acLegMatDate;
	}

	public void setAcLegMatDate(Date acLegMatDate) {
		this.acLegMatDate = acLegMatDate;
	}

	public String getFcySpecActype() {
		return this.fcySpecActype;
	}

	public void setFcySpecActype(String fcySpecActype) {
		this.fcySpecActype = fcySpecActype;
	}

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgenLegalType() {
		return this.agenLegalType;
	}

	public void setAgenLegalType(String agenLegalType) {
		this.agenLegalType = agenLegalType;
	}

	public String getAgentLegalId() {
		return this.agentLegalId;
	}

	public void setAgentLegalId(String agentLegalId) {
		this.agentLegalId = agentLegalId;
	}

	public String getSpecAcctFlag() {
		return this.specAcctFlag;
	}

	public void setSpecAcctFlag(String specAcctFlag) {
		this.specAcctFlag = specAcctFlag;
	}

	public String getLoanAcctFlag() {
		return this.loanAcctFlag;
	}

	public void setLoanAcctFlag(String loanAcctFlag) {
		this.loanAcctFlag = loanAcctFlag;
	}

	public String getCloseRestrict() {
		return this.closeRestrict;
	}

	public void setCloseRestrict(String closeRestrict) {
		this.closeRestrict = closeRestrict;
	}

	public String getPrimaryAcBrn() {
		return this.primaryAcBrn;
	}

	public void setPrimaryAcBrn(String primaryAcBrn) {
		this.primaryAcBrn = primaryAcBrn;
	}

	public String getPrimaryAcNo() {
		return this.primaryAcNo;
	}

	public void setPrimaryAcNo(String primaryAcNo) {
		this.primaryAcNo = primaryAcNo;
	}

	public String getWaiveLedgerFee() {
		return this.waiveLedgerFee;
	}

	public void setWaiveLedgerFee(String waiveLedgerFee) {
		this.waiveLedgerFee = waiveLedgerFee;
	}

	public String getChequesAllowed() {
		return this.chequesAllowed;
	}

	public void setChequesAllowed(String chequesAllowed) {
		this.chequesAllowed = chequesAllowed;
	}

	public Date getOfficialOpenDate() {
		return this.officialOpenDate;
	}

	public void setOfficialOpenDate(Date officialOpenDate) {
		this.officialOpenDate = officialOpenDate;
	}

	public Date getAccountEffDate() {
		return this.accountEffDate;
	}

	public void setAccountEffDate(Date accountEffDate) {
		this.accountEffDate = accountEffDate;
	}

	public Date getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
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

	public String getAccountUsage() {
		return this.accountUsage;
	}

	public void setAccountUsage(String accountUsage) {
		this.accountUsage = accountUsage;
	}

	public String getSecAcStatus() {
		return this.secAcStatus;
	}

	public void setSecAcStatus(String secAcStatus) {
		this.secAcStatus = secAcStatus;
	}

	public Date getSecStatusDate() {
		return this.secStatusDate;
	}

	public void setSecStatusDate(Date secStatusDate) {
		this.secStatusDate = secStatusDate;
	}

	public String getFcyAprvlCrtf() {
		return this.fcyAprvlCrtf;
	}

	public void setFcyAprvlCrtf(String fcyAprvlCrtf) {
		this.fcyAprvlCrtf = fcyAprvlCrtf;
	}

	public String getSafeDepLimccy() {
		return this.safeDepLimccy;
	}

	public void setSafeDepLimccy(String safeDepLimccy) {
		this.safeDepLimccy = safeDepLimccy;
	}

	public Date getSafeDepEnd() {
		return this.safeDepEnd;
	}

	public void setSafeDepEnd(Date safeDepEnd) {
		this.safeDepEnd = safeDepEnd;
	}

	public String getNAcCharacter() {
		return this.NAcCharacter;
	}

	public void setNAcCharacter(String NAcCharacter) {
		this.NAcCharacter = NAcCharacter;
	}

	public String getInterestLiquAcct() {
		return this.interestLiquAcct;
	}

	public void setInterestLiquAcct(String interestLiquAcct) {
		this.interestLiquAcct = interestLiquAcct;
	}

	public Date getAgreeEffDate() {
		return this.agreeEffDate;
	}

	public void setAgreeEffDate(Date agreeEffDate) {
		this.agreeEffDate = agreeEffDate;
	}

	public String getAgreeAmt() {
		return this.agreeAmt;
	}

	public void setAgreeAmt(String agreeAmt) {
		this.agreeAmt = agreeAmt;
	}

	public Date getAgreeEnd() {
		return this.agreeEnd;
	}

	public void setAgreeEnd(Date agreeEnd) {
		this.agreeEnd = agreeEnd;
	}

	public Long getSafeDepLimamt() {
		return this.safeDepLimamt;
	}

	public void setSafeDepLimamt(Long safeDepLimamt) {
		this.safeDepLimamt = safeDepLimamt;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getCancelReason() {
		return this.cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getCentno() {
		return this.centno;
	}

	public void setCentno(String centno) {
		this.centno = centno;
	}

	public String getOrgno() {
		return this.orgno;
	}

	public void setOrgno(String orgno) {
		this.orgno = orgno;
	}

	public String getPostingRestrict() {
		return this.postingRestrict;
	}

	public void setPostingRestrict(String postingRestrict) {
		this.postingRestrict = postingRestrict;
	}

	public String getCashTxnFlg() {
		return this.cashTxnFlg;
	}

	public void setCashTxnFlg(String cashTxnFlg) {
		this.cashTxnFlg = cashTxnFlg;
	}

	public Date getOpeningDate() {
		return this.openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public Date getDepValDate() {
		return this.depValDate;
	}

	public void setDepValDate(Date depValDate) {
		this.depValDate = depValDate;
	}

	public String getTerm() {
		return this.term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getAcCharacter() {
		return this.acCharacter;
	}

	public void setAcCharacter(String acCharacter) {
		this.acCharacter = acCharacter;
	}

	public String getCharDiff() {
		return this.charDiff;
	}

	public void setCharDiff(String charDiff) {
		this.charDiff = charDiff;
	}

	public String getExchangeNo() {
		return this.exchangeNo;
	}

	public void setExchangeNo(String exchangeNo) {
		this.exchangeNo = exchangeNo;
	}

	public String getFcyType() {
		return this.fcyType;
	}

	public void setFcyType(String fcyType) {
		this.fcyType = fcyType;
	}

	public String getLegalEntTyp() {
		return this.legalEntTyp;
	}

	public void setLegalEntTyp(String legalEntTyp) {
		this.legalEntTyp = legalEntTyp;
	}

	public String getLegalEntNo() {
		return this.legalEntNo;
	}

	public void setLegalEntNo(String legalEntNo) {
		this.legalEntNo = legalEntNo;
	}

	public String getInactivMarker() {
		return this.inactivMarker;
	}

	public void setInactivMarker(String inactivMarker) {
		this.inactivMarker = inactivMarker;
	}

	public Long getOpenClearedBal() {
		return this.openClearedBal;
	}

	public void setOpenClearedBal(Long openClearedBal) {
		this.openClearedBal = openClearedBal;
	}

	public Long getOnlineActualBal() {
		return this.onlineActualBal;
	}

	public void setOnlineActualBal(Long onlineActualBal) {
		this.onlineActualBal = onlineActualBal;
	}

	public Long getOnlineClearedBal() {
		return this.onlineClearedBal;
	}

	public void setOnlineClearedBal(Long onlineClearedBal) {
		this.onlineClearedBal = onlineClearedBal;
	}

	public Long getWorkingBalance() {
		return this.workingBalance;
	}

	public void setWorkingBalance(Long workingBalance) {
		this.workingBalance = workingBalance;
	}

	public String getAltAcctId() {
		return this.altAcctId;
	}

	public void setAltAcctId(String altAcctId) {
		this.altAcctId = altAcctId;
	}

	public String getMasterAccount() {
		return this.masterAccount;
	}

	public void setMasterAccount(String masterAccount) {
		this.masterAccount = masterAccount;
	}

	public String getCoCode() {
		return this.coCode;
	}

	public void setCoCode(String coCode) {
		this.coCode = coCode;
	}

	public String getAcctStt() {
		return this.acctStt;
	}

	public void setAcctStt(String acctStt) {
		this.acctStt = acctStt;
	}

	public String getInputter() {
		return inputter;
	}

	public void setInputter(String inputter) {
		this.inputter = inputter;
	}

	public Date getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(Date processingDate) {
		this.processingDate = processingDate;
	}

	/**
	 * @return the alarmFlag
	 */
	public String getAlarmFlag() {
		return alarmFlag;
	}

	/**
	 * @param alarmFlag the alarmFlag to set
	 */
	public void setAlarmFlag(String alarmFlag) {
		this.alarmFlag = alarmFlag;
	}
	
	
	

}