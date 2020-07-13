/*    */ package com.mzj.springboot.actionpai.common;
/*    */ 
/*    */ public enum ResponseCode
/*    */ {
/*  7 */   SUCEESS(0, "SUCCESS"), 
/*  8 */   ERROR(-1, "ERROR");
/*    */ 
/*    */   private final int code;
/*    */   private final String desc;
/*    */ 
/* 14 */   private ResponseCode(int code, String desc) { this.code = code;
/* 15 */     this.desc = desc; }
/*    */ 
/*    */   public int getCode()
/*    */   {
/* 19 */     return this.code;
/*    */   }
/*    */ 
/*    */   public String getDesc() {
/* 23 */     return this.desc;
/*    */   }
/*    */ }

/* Location:           C:\Users\mazhj\Desktop\gdi-0.0.1-SNAPSHOT.jar
 * Qualified Name:     BOOT-INF.classes.com.kd.gdi.common.ResponseCode
 * JD-Core Version:    0.6.0
 */