package com.fattahi.cloud.zuul;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class PostFilter extends ZuulFilter {

   @Override
   public boolean shouldFilter() {
      return true;
   }

   @Override
   public Object run() {
      RequestContext ctx = RequestContext.getCurrentContext();
      ctx.getRequest().getRequestURL();
      /*String body = ctx.getResponseBody();
      HttpServletRequest request = ctx.getRequest();
      HttpServletResponse response = ctx.getResponse();*/
      return null;
   }

   @Override
   public String filterType() {
      return "post";
   }

   @Override
   public int filterOrder() {
      return 10;
   }

}
