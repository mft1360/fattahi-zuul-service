package com.fattahi.cloud.zuul;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class PreZuulFilter extends ZuulFilter {

   @Override
   public boolean shouldFilter() {
      return true;
   }

   @Override
   public Object run() {
      RequestContext ctx = RequestContext.getCurrentContext();
      ctx.getRequest().getRequestURL();
      /*
       * ctx.addZuulRequestHeader("ZuulFilter", "Zuul Filter");
       * HttpServletRequest request = ctx.getRequest();
       * String token = request.getHeader("X-AUTH-TOKEN");
       * System.out.println(token);
       * String url = request.getHeader("requestedurl");
       * System.out.println(url);
       * System.out.println(request.getMethod() + "---- " +
       * request.getRequestURL().toString());
       */
      return null;
   }

   @Override
   public String filterType() {
      return "pre";
   }

   @Override
   public int filterOrder() {
      return 10;
   }

}
