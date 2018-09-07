package com.recon.model;


//[{"Side":"FO","BuySell":"Buy","TradeId":"12345","Counterparty ID":"1234","Counterparty name":"ABC DEF",
//"FO Code":"VIP","Status":null,"Attribute":null,"Category":"Singleton","Value":null}]
public class ExceptionResponse {

		private String tradeid;
		private String counterpartyid;
		private String category;
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		private String subcat1;
		private String subcat2;
		private String ref1;
		private String ref2;
		public String getTradeid() {
			return tradeid;
		}
		public void setTradeid(String tradeid) {
			this.tradeid = tradeid;
		}
		public String getCounterpartyid() {
			return counterpartyid;
		}
		public void setCounterpartyid(String counterpartyid) {
			this.counterpartyid = counterpartyid;
		}
		public String getSubcat1() {
			return subcat1;
		}
		public void setSubcat1(String subcat1) {
			this.subcat1 = subcat1;
		}
		public String getSubcat2() {
			return subcat2;
		}
		public void setSubcat2(String subcat2) {
			this.subcat2 = subcat2;
		}
		public String getRef1() {
			return ref1;
		}
		public void setRef1(String ref1) {
			this.ref1 = ref1;
		}
		public String getRef2() {
			return ref2;
		}
		public void setRef2(String ref2) {
			this.ref2 = ref2;
		}
		
		
		
}