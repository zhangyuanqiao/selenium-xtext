function(){return function(){var d=this;function aa(a,b){var c=Array.prototype.slice.call(arguments,1);return function(){var b=c.slice();b.push.apply(b,arguments);return a.apply(this,b)}}function f(a,b){function c(){}c.prototype=b.prototype;a.f=b.prototype;a.prototype=new c;a.prototype.constructor=a;a.c=function(a,c,p){for(var m=Array(arguments.length-2),n=2;n<arguments.length;n++)m[n-2]=arguments[n];return b.prototype[c].apply(a,m)}};var ba=window;var g=String.prototype.trim?function(a){return a.trim()}:function(a){return a.replace(/^[\s\xa0]+|[\s\xa0]+$/g,"")};
function k(a,b){for(var c=0,e=g(String(a)).split("."),h=g(String(b)).split("."),p=Math.max(e.length,h.length),m=0;0==c&&m<p;m++){var n=e[m]||"",ha=h[m]||"",ia=RegExp("(\\d*)(\\D*)","g"),ja=RegExp("(\\d*)(\\D*)","g");do{var q=ia.exec(n)||["","",""],r=ja.exec(ha)||["","",""];if(0==q[0].length&&0==r[0].length)break;c=l(0==q[1].length?0:parseInt(q[1],10),0==r[1].length?0:parseInt(r[1],10))||l(0==q[2].length,0==r[2].length)||l(q[2],r[2])}while(0==c)}return c}function l(a,b){return a<b?-1:a>b?1:0};function t(a){if(Error.captureStackTrace)Error.captureStackTrace(this,t);else{var b=Error().stack;b&&(this.stack=b)}a&&(this.message=String(a))}f(t,Error);t.prototype.name="CustomError";var u;a:{var v=d.navigator;if(v){var w=v.userAgent;if(w){u=w;break a}}u=""}function x(a){return-1!=u.indexOf(a)};function y(){return x("Opera")||x("OPR")}function z(){return(x("Chrome")||x("CriOS"))&&!y()&&!x("Edge")};function A(){return x("iPhone")&&!x("iPod")&&!x("iPad")};var B=y(),C=x("Trident")||x("MSIE"),D=x("Edge"),E=x("Gecko")&&!(-1!=u.toLowerCase().indexOf("webkit")&&!x("Edge"))&&!(x("Trident")||x("MSIE"))&&!x("Edge"),F=-1!=u.toLowerCase().indexOf("webkit")&&!x("Edge");function ca(){var a=u;if(E)return/rv\:([^\);]+)(\)|;)/.exec(a);if(D)return/Edge\/([\d\.]+)/.exec(a);if(C)return/\b(?:MSIE|rv)[: ]([^\);]+)(\)|;)/.exec(a);if(F)return/WebKit\/(\S+)/.exec(a)}function G(){var a=d.document;return a?a.documentMode:void 0}
var H=function(){if(B&&d.opera){var a;var b=d.opera.version;try{a=b()}catch(c){a=b}return a}a="";(b=ca())&&(a=b?b[1]:"");return C&&(b=G(),b>parseFloat(a))?String(b):a}(),I={},J=d.document,da=J&&C?G()||("CSS1Compat"==J.compatMode?parseInt(H,10):5):void 0;var ea=x("Firefox"),fa=A()||x("iPod"),ga=x("iPad"),K=x("Android")&&!(z()||x("Firefox")||y()||x("Silk")),ka=z(),L=x("Safari")&&!(z()||x("Coast")||y()||x("Edge")||x("Silk")||x("Android"))&&!(A()||x("iPad")||x("iPod"));function M(a){return(a=a.exec(u))?a[1]:""}var la=function(){if(ea)return M(/Firefox\/([0-9.]+)/);if(C||D||B)return H;if(ka)return M(/Chrome\/([0-9.]+)/);if(L&&!(A()||x("iPad")||x("iPod")))return M(/Version\/([0-9.]+)/);if(fa||ga){var a;if(a=/Version\/(\S+).*Mobile\/(\S+)/.exec(u))return a[1]+"."+a[2]}else if(K)return(a=M(/Android\s+([0-9.]+)/))?a:M(/Version\/([0-9.]+)/);return""}();var ma={},N;function O(a){return na?N(a):K?0<=k(oa,a):0<=k(la,a)}var na=function(){if(!E)return!1;var a=d.Components;if(!a)return!1;try{if(!a.classes)return!1}catch(b){return!1}var c=a.classes,a=a.interfaces,e=c["@mozilla.org/xpcom/version-comparator;1"].getService(a.nsIVersionComparator),h=c["@mozilla.org/xre/app-info;1"].getService(a.nsIXULAppInfo).version;N=function(a){return 0<=e.compare(h,""+a)};return!0}(),P;if(K){var Q=/Android\s+([0-9\.]+)/.exec(u);P=Q?Q[1]:"0"}else P="0";var oa=P;K&&O(2.3);
K&&O(4);L&&O(6);function R(a){t.call(this,a)}f(R,t);function S(a,b){return(new RegExp(a)).test(b)}function pa(a,b){return(new RegExp(a,"i")).test(b)}function qa(a){a=a.replace(/([.^$+(){}\[\]\\|])/g,"\\$1");a=a.replace(/\?/g,"(.|[\r\n])");return a=a.replace(/\*/g,"(.|[\r\n])*")}var T={exact:function(a,b){return-1!=b.indexOf(a)},glob:function(a,b){return(new RegExp("^"+qa(a)+"$")).test(b)},globcontains:function(a,b){return(new RegExp(qa(a))).test(b)},regex:S,regexi:pa,regexpi:pa,regexp:S};
function ra(a){var b="glob",c=/^([a-zA-Z-]+):(.*)/.exec(a);if(c){var e=c[1],c=c[2];T[e.toLowerCase()]&&(b=e.toLowerCase(),a=c)}e=T[b];if(!e)throw new R("Cannot find pattern matching strategy: "+b);"glob"==b?(0==a.indexOf("glob:")&&(a=a.substring(5)),e=T.glob):"exact"==b&&0==a.indexOf("exact:")&&(a=a.substring(6));a=aa(e,a);a.a=b;return a};var U;if(!(U=!E&&!C)){var V;if(V=C)V=9<=da;U=V}U||E&&(I["1.9.1"]||(I["1.9.1"]=0<=k(H,"1.9.1")));C&&(I["9"]||(I["9"]=0<=k(H,"9")));function sa(a,b){if(a.style&&("hidden"==a.style.visibility||"none"==a.style.display))return"";var c;if(3==a.nodeType)return c=a.data,b||(c=c.replace(/\n|\r|\t/g," ")),c.replace(/&nbsp/," ");if(1==a.nodeType&&"SCRIPT"!=a.nodeName){var e=b||"PRE"==a.tagName;c="";for(var h=0;h<a.childNodes.length;h++){var p=a.childNodes.item(h);p&&(c+=sa(p,e))}if("P"==a.tagName||"BR"==a.tagName||"HR"==a.tagName||"DIV"==a.tagName)c+="\n";c=c.replace(/&nbsp/," ");ma.b&&O(9)&&(c=c.replace(/&#100;/," "));return c}return""}
;function ta(a){var b;if(b=ba.document.body){var c="";E&&"1.8"<=H||F||C?c=sa(b,!1):b.textContent?c=b.textContent:b.innerText&&(c=b.innerText);c=c.replace(/\r\n|\r/g,"\n");b=c.replace(/\ +/g," ");c=new RegExp(String.fromCharCode(160),"g");if(F)for(c=String.fromCharCode(160);-1!=b.indexOf(c);)b=b.replace(c," ");else b=b.replace(c," ");b=g(b)}else b="";c=ra(a);"glob"==c.a&&(0==a.indexOf("glob:")&&(a=a.substring(5)),c=ra("globContains:"+a));return c(b)}var W=["_"],X=d;
W[0]in X||!X.execScript||X.execScript("var "+W[0]);for(var Y;W.length&&(Y=W.shift());){var Z;if(Z=!W.length)Z=void 0!==ta;Z?X[Y]=ta:X[Y]?X=X[Y]:X=X[Y]={}};; return this._.apply(null,arguments);}.apply({navigator:typeof window!=undefined?window.navigator:null,document:typeof window!=undefined?window.document:null}, arguments);}
