(window.webpackJsonp=window.webpackJsonp||[]).push([[34],{"+Toe":function(e,t,r){"use strict";var n=r("2bPg"),a=r("BRlI"),c=r("PK3Q"),o=r("Q5Ww"),i=r("00an"),s=r("VDzl");var u=function(e){function t(e){var r;return Object(n.a)(this,t),(r=Object(c.a)(this,Object(o.a)(t).call(this,function(e){return"The method `".concat(e,"` is not implemented")}(e))))._methodName=e,r}return Object(i.a)(t,e),Object(a.a)(t,[{key:"methodName",get:function(){return this._methodName}}]),t}(Object(s.a)(Error));t.a=u},"0qOM":function(e,t,r){"use strict";var n=r("gbB/"),a=r.n(n),c=r("boeR"),o=r("i5Br"),i=r.n(o),s=r("zXLR");function u(e){var t=e.isFit,r=e.isTransparent,n=e.message,o=e.redirectLabel,u=e.redirectTo,l=e.replace;return a.a.createElement("div",{className:"layout"},a.a.createElement("div",{className:i()("layout__content layout__content--centered p-10",{"layout__content--fit":t},{"layout__content--transparent":r})},a.a.createElement("p",{className:"text-c"},n),o&&u&&a.a.createElement(s.a,{className:"btn btn-primary",component:c.Link,to:u,replace:l},o)))}u.defaultProps={replace:!1}},"2Hh2":function(e,t,r){"use strict";var n=r("g4DW"),a=r("DjBF"),c=r("7cf5"),o=r("gbB/"),i=r.n(o),s=r("i5Br"),u=r.n(s),l=r("ldfh"),d=r("tjC1");t.a=function(e){var t=e.className,r=e.items,s=e.hasSidebarHeader,b=e.hasHeaderToggleBtn,f=e.gaCategory,O=e.headerContent,p=e.footerContent,m=e.isAlwaysOpen,v=void 0!==m&&m,g=Object(c.a)(e,["className","items","hasSidebarHeader","hasHeaderToggleBtn","gaCategory","headerContent","footerContent","isAlwaysOpen"]),y=Object(l.k)().tablet;Object(o.useEffect)((function(){_()}),[]);var j=Object(o.useState)(!1),h=Object(a.a)(j,2),E=h[0],w=h[1],_=function(){w(!(!v&&y))};return i.a.createElement(d.a,Object.assign({className:u()(Object(n.a)({},t,t),"sidebar__".concat(E?"open":"close")),arrowClasses:u()(Object(n.a)({},"icon-arrow-".concat(y?"down":"left"),!0)),items:r,toggle:function(){w(!E)},hasHeaderToggleBtn:b,gaCategory:f||void 0,headerContent:O,footerContent:p,hasSidebarHeader:s},g))}},"6xkA":function(e,t,r){"use strict";r.d(t,"b",(function(){return O}));var n=r("g4DW"),a=r("butC"),c=r("dOmW"),o=r.n(c),i=r("NNZK"),s=r("T+CM");function u(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,n)}return r}function l(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?u(Object(r),!0).forEach((function(t){Object(n.a)(e,t,r[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):u(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}var d="".concat(s.x,"/SEARCH_QUERY_INIT"),b="".concat(s.x,"/SEARCH_QUERY_DONE"),f="".concat(s.x,"/SEARCH_QUERY_ERROR");function O(e){return function(){var t=Object(a.a)(o.a.mark((function t(r,n){var a;return o.a.wrap((function(t){for(;;)switch(t.prev=t.next){case 0:if(!n().header.search.isLoading){t.next=3;break}return t.abrupt("return");case 3:return r({type:d}),t.prev=4,t.next=7,i.a.searchKeyword(e);case 7:a=t.sent,r({type:b,payload:a}),t.next=14;break;case 11:t.prev=11,t.t0=t.catch(4),r({type:f,payload:t.t0});case 14:case"end":return t.stop()}}),t,null,[[4,11]])})));return function(e,r){return t.apply(this,arguments)}}()}var p={isLoading:!1,data:null,error:null};t.a=function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:p,t=arguments.length>1?arguments[1]:void 0,r=t.type,n=t.payload;switch(r){case d:return l(l({},e),{},{error:null,isLoading:!0});case b:return l(l({},e),{},{isLoading:!1,data:n,error:null});case f:return l(l({},e),{},{isLoading:!1,error:n});default:return e}}},IJNI:function(e,t,r){"use strict";var n=r("g4DW"),a=r("7cf5"),c=r("gbB/"),o=r.n(c),i=r("i5Br"),s=r.n(i),u=r("q7zV"),l=r("y1EJ"),d=r("+tDs");function b(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,n)}return r}t.a=Object(d.c)((function(e){var t=e.className,r=e.component,c=e.iconName,i=e.item,d=e.isNew,f=e.withBadge,O=(e.isVisible,Object(a.a)(e,["className","component","iconName","item","isNew","withBadge","isVisible"])),p=s()("sidebar__item-text",{"sidebar__item-text--new":d||!1});return o.a.createElement(r,function(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?b(Object(r),!0).forEach((function(t){Object(n.a)(e,t,r[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):b(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}({className:s()("sidebar__item",Object(n.a)({},t,t))},O),[c?o.a.createElement(u.a,{key:"icon",name:c,className:"sidebar__item-icon"},f&&o.a.createElement(l.a,{position:{top:"1rem",right:"1rem"},style:{minWidth:"0.5rem",minHeight:"0.5rem",borderRadius:"50%"},type:"info"})):null,o.a.createElement("span",{key:"label",className:s()("sidebar__item--text",Object(n.a)({},p,p))},i)])}))},LO7R:function(e,t,r){"use strict";var n,a,c=r("UM7G"),o=r("2TJN"),i=r("h0hd"),s=r("T8da"),u=r("aJYY"),l=[o.a,u.a.middleware,i.a.middleware,s.a.middleware],d=[c.a.apply(void 0,l)],b="object"==typeof window&&["development","staging"].includes(null===(n=window)||void 0===n?void 0:null===(a=n.ENV_VARS)||void 0===a?void 0:a.mode)&&window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__?window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__({}):c.d;t.a=function(e){var t=b.apply(void 0,d),r=Object(c.e)(e(),t);return r.asyncReducers={},r.injectReducer=function(t,n){return r.asyncReducers[t]=n,r.replaceReducer(e(r.asyncReducers)),r},r}},NNZK:function(e,t,r){"use strict";var n=r("upII");t.a={searchKeyword:function(e){return Object(n.b)("GET","/search_index/",{q:e})}}},RRQN:function(e,t,r){"use strict";var n=r("7cf5"),a=r("gbB/"),c=r.n(a),o=r("tKK5"),i=r("nz4c");t.a=function(e){var t=e.children,r=e.renderSingletons,a=void 0!==r&&r,s=e.namespace,u=e.alertProps,l=void 0===u?{}:u,d=e.dialogProps,b=void 0===d?{}:d,f=Object(n.a)(e,["children","renderSingletons","namespace","alertProps","dialogProps"]);return c.a.createElement(o.U,f,c.a.createElement(o.v,null,t,a&&c.a.createElement(c.a.Fragment,null,c.a.createElement(o.b,Object.assign({name:s},l)),c.a.createElement(o.p,Object.assign({name:s},b)),c.a.createElement(o.eb,null),c.a.createElement(o.T,null)),c.a.createElement(i.a,null)))}},T8da:function(e,t,r){"use strict";var n=r("g4DW"),a=r("butC"),c=r("dOmW"),o=r.n(c),i=r("uf/X"),s=r("oCcC"),u=r("/b1K");function l(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,n)}return r}function d(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?l(Object(r),!0).forEach((function(t){Object(n.a)(e,t,r[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):l(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}var b,f=Object(s.d)({baseUrl:"/v2/problem_list"}),O=Object(u.a)({reducerPath:"onboardingBlockerFirstProblem",baseQuery:(b=Object(a.a)(o.a.mark((function e(){var t,r,n=arguments;return o.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,f.apply(void 0,n);case 2:if(!(r=e.sent).meta.response.ok||null===(t=r.data)||void 0===t||!t.items){e.next=5;break}return e.abrupt("return",d(d({},r),{},{data:i.a.toCase("camelCase",r.data).items[0]||{}}));case 5:return e.abrupt("return",r);case 6:case"end":return e.stop()}}),e)}))),function(){return b.apply(this,arguments)}),endpoints:function(){return{}}});t.a=O},UcDd:function(e,t,r){"use strict";r("tryK");var n=r("W+XG");r.d(t,"a",(function(){return n.a}));var a=r("2u0L");r.d(t,"b",(function(){return a.a}));var c=r("3bhF");r.d(t,"c",(function(){return c.a}));r("0qOM");var o=r("dv5D");r.d(t,"d",(function(){return o.a}))},"W+XG":function(e,t,r){"use strict";var n=r("gbB/"),a=r.n(n);t.a=function(e){var t=e.type,r=e.height;switch(t){case"block":return a.a.createElement("div",{style:{height:"100%"}});case"flex-fill":return a.a.createElement("div",{style:{flex:"1 0 0"}});case"flex-auto":return a.a.createElement("div",{style:{flex:"1 0 auto"}});default:return a.a.createElement("div",{style:{height:r}})}}},WXUJ:function(e,t,r){"use strict";var n=r("2bPg"),a=r("BRlI"),c=r("PK3Q"),o=r("Q5Ww"),i=r("00an"),s=r("VDzl"),u=function(e){function t(e,r){var a;return Object(n.a)(this,t),(a=Object(c.a)(this,Object(o.a)(t).call(this,e)))._underlyingError=r,a}return Object(i.a)(t,e),Object(a.a)(t,[{key:"isValid",get:function(){return this.underlying.isFromServer}},{key:"status",get:function(){return this.isValid?this.underlying.response.status:-1}},{key:"underlying",get:function(){return this._underlyingError}}]),t}(Object(s.a)(Error));t.a=u},XxnZ:function(e,t,r){"use strict";var n=r("2bPg"),a=r("PK3Q"),c=r("Q5Ww"),o=r("00an"),i=r("VDzl"),s=function(e){return"S3Error::".concat(e)},u=function(e){function t(e){var r;return Object(n.a)(this,t),(r=Object(a.a)(this,Object(c.a)(t).call(this,s(e)))).message=s(e),r.errorCode=e,r}return Object(o.a)(t,e),t}(Object(i.a)(Error));u.ATTACHMENT_INITIALIZATION_FAILED="ATTACHMENT_INITIALIZATION_FAILED",u.PAPERCLIP_POSTPOLICY_FAILED="PAPERCLIP_POSTPOLICY_FAILED",u.S3_UPLOAD_FAILED="S3_UPLOAD_FAILED",u.FILE_UPDATION_FAILED="FILE_UPDATION_FAILED",u.NETWORK_PROBLEM_DETECTED="NETWORK_PROBLEM_DETECTED",t.a=u},fUVL:function(e,t,r){"use strict";var n=r("UM7G"),a=r("ztZk"),c=r("6xkA");t.a=Object(n.c)({user:a.b,search:c.a})},gxFQ:function(e,t,r){"use strict";r.d(t,"a",(function(){return u}));var n=r("g4DW"),a=r("CWUs"),c=r.n(a),o=r("nDeB");function i(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,n)}return r}function s(e){var t=function(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?i(Object(r),!0).forEach((function(t){Object(n.a)(e,t,r[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):i(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}({},e.attributes);return e.meta&&(t.meta=e.meta),e.relationships&&(t.associations={},c()(e.relationships,(function(e,r){t.associations[r]=e.data}))),t}var u=function(e){if(!e)return null;var t=function(e){var t,r=e.data,n=e.meta,a=e.included,c={};return t=Array.isArray(r)?r.map(s):s(r),a&&a.forEach((function(e){var t=e.type,r=e.id;c[t]||(c[t]={}),c[t][r]=s(e)})),{data:t,associations:c,meta:n}}(e),r=t.data,n=t.associations,a=t.meta;return{data:Object(o.a)(r,n),meta:a}}},h0hd:function(e,t,r){"use strict";var n=r("g4DW"),a=r("butC"),c=r("dOmW"),o=r.n(c),i=r("oCcC"),s=r("/b1K"),u=r("gxFQ"),l=r("uf/X");function d(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,n)}return r}function b(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?d(Object(r),!0).forEach((function(t){Object(n.a)(e,t,r[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):d(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}var f,O=Object(i.d)({baseUrl:"/v2/crt"}),p=Object(s.a)({reducerPath:"onboardingBlockerCRT",baseQuery:(f=Object(a.a)(o.a.mark((function e(){var t,r,n=arguments;return o.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,O.apply(void 0,n);case 2:if(!(r=e.sent).meta.response.ok||null===(t=r.data)||void 0===t||!t.data){e.next=5;break}return e.abrupt("return",b(b({},r),{},{data:l.a.toCase("camelCase",Object(u.a)(null==r?void 0:r.data.data))}));case 5:return e.abrupt("return",r);case 6:case"end":return e.stop()}}),e)}))),function(){return f.apply(this,arguments)}),endpoints:function(){return{}}});t.a=p},h2tT:function(e,t,r){},nDeB:function(e,t,r){"use strict";r.d(t,"a",(function(){return u}));var n=r("7cf5"),a=(r("fR9/"),r("CWUs")),c=r.n(a),o=r("YqKy");function i(e,t){var r=e.type,n=e.id,a=t[r]&&t[r][n];if(a)return s(a,t);var c=parseInt(n,10);return{id:Number.isNaN(c)?n:c}}function s(e,t){var r=e.associations,a=Object(n.a)(e,["associations"]);return c()(r,(function(e,r){Object(o.d)(e)?a[r]=null:Array.isArray(e)?a[r]=e.map((function(e){return i(e,t)})):a[r]=i(e,t)})),a}function u(e,t){return Array.isArray(e)?e.map((function(e){return s(e,t)})):Object(o.d)(e)?null:s(e,t)}},nz4c:function(e,t,r){"use strict";r.d(t,"a",(function(){return i}));var n=r("DjBF"),a=r("gbB/"),c=r.n(a),o=r("8bDF");function i(){var e=Object(a.useState)(null),t=Object(n.a)(e,2),r=t[0],i=t[1],s=function(e){var t=e.data,r=JSON.parse(t),n=r.type,a=r.data,c=(a=void 0===a?{}:a).percent;"invalid"!==n?"progress-update"===n&&i(100===c?null:c):i(20)};return Object(a.useEffect)((function(){Object(o.b)()&&(new WebSocket("ws://localhost:8080/sockjs-node").onmessage=s)}),[]),Object(o.b)()&&r>0?c.a.createElement(c.a.Fragment,null,r&&c.a.createElement("div",{className:"hmr"},c.a.createElement("div",{className:"hmr__progress",style:{width:"".concat(r,"%")}}))):null}},sluu:function(e,t,r){"use strict";var n=r("WXUJ");r.d(t,"a",(function(){return n.a}));var a=r("+Toe");r.d(t,"b",(function(){return a.a}));var c=r("XxnZ");r.d(t,"c",(function(){return c.a}));r("SBIh")},tjC1:function(e,t,r){"use strict";var n=r("7cf5"),a=r("gbB/"),c=r.n(a),o=r("i5Br"),i=r.n(o),s=r("IJNI"),u=r("tKK5"),l=r("ldfh");t.a=function(e){var t=e.className,r=(e.sidebarClasses,e.arrowClasses),o=e.items,d=(e.device,e.toggle),b=e.hasHeaderToggleBtn,f=e.gaCategory,O=void 0===f?"":f,p=e.headerContent,m=e.footerContent,v=e.hasSidebarHeader,g=void 0===v||v,y=Object(n.a)(e,["className","sidebarClasses","arrowClasses","items","device","toggle","hasHeaderToggleBtn","gaCategory","headerContent","footerContent","hasSidebarHeader"]),j=Object(l.k)().mobile,h=Object(a.useCallback)((function(e){window.trackGaEvent("Academy-Sidebar","Navigation",e)}),[]);return c.a.createElement(c.a.Fragment,null,b&&c.a.createElement("div",{className:"sidebar__open-btn"},c.a.createElement(u.bb,{className:"btn btn-icon btn-inverted",onClick:d},c.a.createElement(u.D,{name:"hamburger"}))),c.a.createElement("div",Object.assign({"data-testid":"sidebar",className:i()("sidebar",t)},y),g&&c.a.createElement("div",{className:"sidebar__header",onClick:d},c.a.createElement("span",{className:"sidebar__header-text"},"Scaler"),c.a.createElement("span",{className:i()("sidebar__arrow",r)})),j&&b&&c.a.createElement("div",{className:"sidebar__close-btn","data-testid":"sidebar-close-icon"},c.a.createElement(u.bb,{className:"btn btn-icon btn-inverted",onClick:d},c.a.createElement(u.D,{name:"close"}))),p,c.a.createElement("div",{className:"sidebar__content scroll-bar-hidden",onClick:j?d:null},o.map((function(e,t){return function(e){return void 0===e.isVisible||e.isVisible}(e)&&c.a.createElement(s.a,Object.assign({key:t,onClick:function(){return h("".concat(O).concat(e.item))},gtmEventType:"side_nav",gtmEventAction:"click",gtmEventResult:e.item,gtmEventLink:e.to},e))}))),m))}},tryK:function(e,t,r){"use strict";var n=r("g4DW"),a=r("7cf5"),c=r("gbB/"),o=r.n(c),i=r("i5Br"),s=r.n(i),u=r("2Hh2");function l(e){var t=e.children,r=e.className,c=e.isSidebarDisabled,i=e.sidebarItems,l=e.sidebarClassName,d=e.product,b=e.onlySidebar,f=e.hasHeaderToggleBtn,O=e.sidebarGaCategory,p=void 0===O?"":O,m=e.sidebarHeaderContent,v=e.sidebarFooterContent,g=Object(a.a)(e,["children","className","isSidebarDisabled","sidebarItems","sidebarClassName","product","onlySidebar","hasHeaderToggleBtn","sidebarGaCategory","sidebarHeaderContent","sidebarFooterContent"]);return o.a.createElement("div",Object.assign({className:s()("dashboard",Object(n.a)({},r,r))},g),!c&&o.a.createElement(u.a,{className:l,items:i,product:d,hasHeaderToggleBtn:f,gaCategory:p||void 0,headerContent:m,footerContent:v}),b?"":o.a.createElement("div",{className:s()("dashboard__content",{"dashboard__content--sidebar-disabled":c})},t))}l.defaultProps={isSidebarDisabled:!1,sidebarClassName:"",onlySidebar:!1}},ztZk:function(e,t,r){"use strict";r.d(t,"d",(function(){return p})),r.d(t,"a",(function(){return m})),r.d(t,"c",(function(){return v})),r.d(t,"e",(function(){return g}));var n=r("g4DW"),a=r("upjz"),c=r("T+CM"),o=r("JqKp");function i(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,n)}return r}function s(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?i(Object(r),!0).forEach((function(t){Object(n.a)(e,t,r[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):i(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}var u="interviewbit/header",l="".concat(u,"/CHANGE_COINS"),d="".concat(u,"/FINISH_NUX_TOUR"),b="".concat(u,"/UPDATE_SCORE"),f="".concat(u,"/UPDATE/USER_DATA"),O="".concat(u,"/UPDATE/SCALER_HUB_DATA"),p=function(e){return function(t){return t({type:f,payload:e})}},m=function(e){return function(t){return t({type:l,payload:e})}},v=function(e,t){return function(r){r({type:d,payload:{NuxKey:e,NuxValue:t}})}},g=function(e,t){var r=e.hasSolved,n=e.submissionResult,a=e.achievedScore,c=t.obtainedScore;return function(e){r&&"correct_answer"===n&&e({type:b,payload:c||a})}},y={data:o.w,loggedIn:Boolean(null===o.w||void 0===o.w?void 0:o.w.userId),Options:[{href:"/profile/".concat(null===o.w||void 0===o.w?void 0:o.w.username),label:"Profile"}].concat(Object(a.a)(c.B))};t.b=function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:y,t=arguments.length>1?arguments[1]:void 0,r=t.type,a=t.payload;switch(r){case l:return s(s({},e),{},{data:s(s({},e.data),{},{coins:a})});case d:return s(s({},e),{},{data:s(s({},e.data),{},Object(n.a)({},a.NuxKey,a.NuxValue))});case b:return s(s({},e),{},{data:s(s({},e.data),{},{score:e.data.score+a})});case f:return s(s({},e),{},{data:s(s({},e.data),a),loggedIn:!0});case O:return s(s({},e),{},{data:s(s({},e.data),a)});default:return e}}}}]);