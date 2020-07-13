/*    */ package com.mzj.springboot.actionpai.common;
/*    */ 
/*    */

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

import java.io.Serializable;

/*    */
/*    */

/*    */
/*    */ public class ServerResponse<T>
/*    */ {
/*    */   private String msg;
/*    */   private T data;
/*    */   int status;
/*    */ 
/*    */   public T getData()
/*    */   {
/* 18 */     return this.data;
/*    */   }
/*    */ 
/*    */   public void setData(T data) {
/* 22 */     this.data = data;
/*    */   }
/*    */ 
/*    */   public String getMsg() {
/* 26 */     return this.msg;
/*    */   }
/*    */ 
/*    */   public void setMsg(String msg) {
/* 30 */     this.msg = msg;
/*    */   }
/*    */ 
/*    */   public int getStatus() {
/* 34 */     return this.status;
/*    */   }
/*    */ 
/*    */   public void setStatus(int status) {
/* 38 */     this.status = status;
/*    */   }
/*    */ 
/*    */   public ServerResponse(int status) {
/* 42 */     this.status = status;
/*    */   }
/*    */ 
/*    */   public ServerResponse(String msg, int status) {
/* 46 */     this.msg = msg;
/* 47 */     this.status = status;
/*    */   }
/*    */ 
/*    */   public ServerResponse(T data, int status) {
/* 51 */     this.data = data;
/* 52 */     this.status = status;
/*    */   }
/*    */ 
/*    */   public static ServerResponse createBySuccess() {
/* 56 */     return new ServerResponse(ResponseCode.SUCEESS.getCode());
/*    */   }
/*    */ 
/*    */   public static ServerResponse createByErrorMsg(String msg) {
/* 60 */     return new ServerResponse(msg, ResponseCode.ERROR.getCode());
/*    */   }
/*    */ 
/*    */   public static <T> ServerResponse<T> createSuccessByData(T data) {
/* 64 */     return new ServerResponse(data, ResponseCode.SUCEESS.getCode());
/*    */   }
/*    */ 
/*    */   public static ServerResponse<String> createSuccessByData(String msg) {
/* 68 */     return new ServerResponse(msg, ResponseCode.SUCEESS.getCode());
/*    */   }
/*    */ }

/* Location:           C:\Users\mazhj\Desktop\gdi-0.0.1-SNAPSHOT.jar
 * Qualified Name:     BOOT-INF.classes.com.kd.gdi.common.ServerResponse
 * JD-Core Version:    0.6.0
 */