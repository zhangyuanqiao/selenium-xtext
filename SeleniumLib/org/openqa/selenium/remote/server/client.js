'use strict';var e, aa = this;
function ba() {
  Symbol = aa.Symbol || {};
  Symbol.iterator || (Symbol.iterator = "$jscomp$iterator");
  ba = function() {
  };
}
function ca(a) {
  ba();
  if (a[Symbol.iterator]) {
    return a[Symbol.iterator]();
  }
  if (!(a instanceof Array) && "string" != typeof a) {
    throw Error();
  }
  var b = 0;
  return {next:function() {
    return b == a.length ? {done:!0} : {done:!1, value:a[b++]};
  }};
}
var m = this;
function n(a) {
  return void 0 !== a;
}
function da() {
}
function ea(a) {
  a.Ga = function() {
    return a.Lc ? a.Lc : a.Lc = new a;
  };
}
function fa(a) {
  var b = typeof a;
  if ("object" == b) {
    if (a) {
      if (a instanceof Array) {
        return "array";
      }
      if (a instanceof Object) {
        return b;
      }
      var c = Object.prototype.toString.call(a);
      if ("[object Window]" == c) {
        return "object";
      }
      if ("[object Array]" == c || "number" == typeof a.length && "undefined" != typeof a.splice && "undefined" != typeof a.propertyIsEnumerable && !a.propertyIsEnumerable("splice")) {
        return "array";
      }
      if ("[object Function]" == c || "undefined" != typeof a.call && "undefined" != typeof a.propertyIsEnumerable && !a.propertyIsEnumerable("call")) {
        return "function";
      }
    } else {
      return "null";
    }
  } else {
    if ("function" == b && "undefined" == typeof a.call) {
      return "object";
    }
  }
  return b;
}
function ga(a) {
  return "array" == fa(a);
}
function ha(a) {
  var b = fa(a);
  return "array" == b || "object" == b && "number" == typeof a.length;
}
function p(a) {
  return "string" == typeof a;
}
function r(a) {
  return "function" == fa(a);
}
function ia(a) {
  var b = typeof a;
  return "object" == b && null != a || "function" == b;
}
function u(a) {
  return a[ja] || (a[ja] = ++ka);
}
var ja = "closure_uid_" + (1E9 * Math.random() >>> 0), ka = 0;
function la(a, b, c) {
  return a.call.apply(a.bind, arguments);
}
function na(a, b, c) {
  if (!a) {
    throw Error();
  }
  if (2 < arguments.length) {
    var d = Array.prototype.slice.call(arguments, 2);
    return function() {
      var c = Array.prototype.slice.call(arguments);
      Array.prototype.unshift.apply(c, d);
      return a.apply(b, c);
    };
  }
  return function() {
    return a.apply(b, arguments);
  };
}
function v(a, b, c) {
  v = Function.prototype.bind && -1 != Function.prototype.bind.toString().indexOf("native code") ? la : na;
  return v.apply(null, arguments);
}
function oa(a, b) {
  var c = Array.prototype.slice.call(arguments, 1);
  return function() {
    var b = c.slice();
    b.push.apply(b, arguments);
    return a.apply(this, b);
  };
}
var pa = Date.now || function() {
  return +new Date;
};
function w(a, b) {
  function c() {
  }
  c.prototype = b.prototype;
  a.m = b.prototype;
  a.prototype = new c;
  a.prototype.constructor = a;
  a.Xd = function(a, c, g) {
    for (var h = Array(arguments.length - 2), k = 2;k < arguments.length;k++) {
      h[k - 2] = arguments[k];
    }
    return b.prototype[c].apply(a, h);
  };
}
;function qa(a, b) {
  this.code = a;
  this.state = x[a] || ra;
  this.message = b || "";
  var c = this.state.replace(/((?:^|\s+)[a-z])/g, function(a) {
    return a.toUpperCase().replace(/^[\s\xa0]+/g, "");
  }), d = c.length - 5;
  if (0 > d || c.indexOf("Error", d) != d) {
    c += "Error";
  }
  this.name = c;
  c = Error(this.message);
  c.name = this.name;
  this.stack = c.stack || "";
}
w(qa, Error);
var ra = "unknown error", x = {15:"element not selectable", 11:"element not visible"};
x[31] = ra;
x[30] = ra;
x[24] = "invalid cookie domain";
x[29] = "invalid element coordinates";
x[12] = "invalid element state";
x[32] = "invalid selector";
x[51] = "invalid selector";
x[52] = "invalid selector";
x[17] = "javascript error";
x[405] = "unsupported operation";
x[34] = "move target out of bounds";
x[27] = "no such alert";
x[7] = "no such element";
x[8] = "no such frame";
x[23] = "no such window";
x[28] = "script timeout";
x[33] = "session not created";
x[10] = "stale element reference";
x[21] = "timeout";
x[25] = "unable to set cookie";
x[26] = "unexpected alert open";
x[13] = ra;
x[9] = "unknown command";
qa.prototype.toString = function() {
  return this.name + ": " + this.message;
};
function sa(a) {
  var b = a.status;
  if (0 == b) {
    return a;
  }
  b = b || 13;
  a = a.value;
  if (!a || !ia(a)) {
    throw new qa(b, a + "");
  }
  throw new qa(b, a.message + "");
}
;function ta() {
  0 != ua && (va[u(this)] = this);
  this.Ma = this.Ma;
  this.Da = this.Da;
}
var ua = 0, va = {};
ta.prototype.Ma = !1;
ta.prototype.O = function() {
  if (!this.Ma && (this.Ma = !0, this.v(), 0 != ua)) {
    var a = u(this);
    delete va[a];
  }
};
function wa(a, b) {
  a.Ma ? b.call(void 0) : (a.Da || (a.Da = []), a.Da.push(n(void 0) ? v(b, void 0) : b));
}
ta.prototype.v = function() {
  if (this.Da) {
    for (;this.Da.length;) {
      this.Da.shift()();
    }
  }
};
function z(a) {
  a && "function" == typeof a.O && a.O();
}
;function xa(a) {
  if (Error.captureStackTrace) {
    Error.captureStackTrace(this, xa);
  } else {
    var b = Error().stack;
    b && (this.stack = b);
  }
  a && (this.message = String(a));
}
w(xa, Error);
xa.prototype.name = "CustomError";
var ya;
function za(a, b) {
  for (var c = a.split("%s"), d = "", f = Array.prototype.slice.call(arguments, 1);f.length && 1 < c.length;) {
    d += c.shift() + f.shift();
  }
  return d + c.join("%s");
}
var Aa = String.prototype.trim ? function(a) {
  return a.trim();
} : function(a) {
  return a.replace(/^[\s\xa0]+|[\s\xa0]+$/g, "");
};
function Ba(a) {
  if (!Ca.test(a)) {
    return a;
  }
  -1 != a.indexOf("&") && (a = a.replace(Da, "&amp;"));
  -1 != a.indexOf("<") && (a = a.replace(Ea, "&lt;"));
  -1 != a.indexOf(">") && (a = a.replace(Fa, "&gt;"));
  -1 != a.indexOf('"') && (a = a.replace(Ga, "&quot;"));
  -1 != a.indexOf("'") && (a = a.replace(Ha, "&#39;"));
  -1 != a.indexOf("\x00") && (a = a.replace(Ia, "&#0;"));
  return a;
}
var Da = /&/g, Ea = /</g, Fa = />/g, Ga = /"/g, Ha = /'/g, Ia = /\x00/g, Ca = /[\x00&<>"']/, Ja = String.prototype.repeat ? function(a, b) {
  return a.repeat(b);
} : function(a, b) {
  return Array(b + 1).join(a);
};
function Ka(a, b) {
  return a < b ? -1 : a > b ? 1 : 0;
}
function La(a) {
  return String(a).replace(/\-([a-z])/g, function(a, c) {
    return c.toUpperCase();
  });
}
function Ma(a) {
  var b = p(void 0) ? "undefined".replace(/([-()\[\]{}+?*.$\^|,:#<!\\])/g, "\\$1").replace(/\x08/g, "\\x08") : "\\s";
  return a.replace(new RegExp("(^" + (b ? "|[" + b + "]+" : "") + ")([a-z])", "g"), function(a, b, f) {
    return b + f.toUpperCase();
  });
}
;function Na(a, b) {
  b.unshift(a);
  xa.call(this, za.apply(null, b));
  b.shift();
}
w(Na, xa);
Na.prototype.name = "AssertionError";
function Oa(a, b) {
  throw new Na("Failure" + (a ? ": " + a : ""), Array.prototype.slice.call(arguments, 1));
}
;function Pa() {
  var a = Ra;
  return a[a.length - 1];
}
var A = Array.prototype, Sa = A.indexOf ? function(a, b, c) {
  return A.indexOf.call(a, b, c);
} : function(a, b, c) {
  c = null == c ? 0 : 0 > c ? Math.max(0, a.length + c) : c;
  if (p(a)) {
    return p(b) && 1 == b.length ? a.indexOf(b, c) : -1;
  }
  for (;c < a.length;c++) {
    if (c in a && a[c] === b) {
      return c;
    }
  }
  return -1;
}, B = A.forEach ? function(a, b, c) {
  A.forEach.call(a, b, c);
} : function(a, b, c) {
  for (var d = a.length, f = p(a) ? a.split("") : a, g = 0;g < d;g++) {
    g in f && b.call(c, f[g], g, a);
  }
}, Ta = A.filter ? function(a, b, c) {
  return A.filter.call(a, b, c);
} : function(a, b, c) {
  for (var d = a.length, f = [], g = 0, h = p(a) ? a.split("") : a, k = 0;k < d;k++) {
    if (k in h) {
      var l = h[k];
      b.call(c, l, k, a) && (f[g++] = l);
    }
  }
  return f;
}, Ua = A.map ? function(a, b, c) {
  return A.map.call(a, b, c);
} : function(a, b, c) {
  for (var d = a.length, f = Array(d), g = p(a) ? a.split("") : a, h = 0;h < d;h++) {
    h in g && (f[h] = b.call(c, g[h], h, a));
  }
  return f;
}, Va = A.some ? function(a, b, c) {
  return A.some.call(a, b, c);
} : function(a, b, c) {
  for (var d = a.length, f = p(a) ? a.split("") : a, g = 0;g < d;g++) {
    if (g in f && b.call(c, f[g], g, a)) {
      return !0;
    }
  }
  return !1;
}, Wa = A.every ? function(a, b, c) {
  return A.every.call(a, b, c);
} : function(a, b, c) {
  for (var d = a.length, f = p(a) ? a.split("") : a, g = 0;g < d;g++) {
    if (g in f && !b.call(c, f[g], g, a)) {
      return !1;
    }
  }
  return !0;
};
function Xa(a, b) {
  return 0 <= Sa(a, b);
}
function Ya(a, b) {
  var c = Sa(a, b), d;
  (d = 0 <= c) && A.splice.call(a, c, 1);
  return d;
}
function Za(a) {
  return A.concat.apply(A, arguments);
}
function $a(a) {
  var b = a.length;
  if (0 < b) {
    for (var c = Array(b), d = 0;d < b;d++) {
      c[d] = a[d];
    }
    return c;
  }
  return [];
}
function ab(a, b, c, d) {
  A.splice.apply(a, bb(arguments, 1));
}
function bb(a, b, c) {
  return 2 >= arguments.length ? A.slice.call(a, b) : A.slice.call(a, b, c);
}
;function cb(a, b, c) {
  for (var d in a) {
    b.call(c, a[d], d, a);
  }
}
function eb(a) {
  var b = [], c = 0, d;
  for (d in a) {
    b[c++] = a[d];
  }
  return b;
}
var fb = "constructor hasOwnProperty isPrototypeOf propertyIsEnumerable toLocaleString toString valueOf".split(" ");
function gb(a, b) {
  for (var c, d, f = 1;f < arguments.length;f++) {
    d = arguments[f];
    for (c in d) {
      a[c] = d[c];
    }
    for (var g = 0;g < fb.length;g++) {
      c = fb[g], Object.prototype.hasOwnProperty.call(d, c) && (a[c] = d[c]);
    }
  }
}
function hb(a) {
  var b = arguments.length;
  if (1 == b && ga(arguments[0])) {
    return hb.apply(null, arguments[0]);
  }
  if (b % 2) {
    throw Error("Uneven number of arguments");
  }
  for (var c = {}, d = 0;d < b;d += 2) {
    c[arguments[d]] = arguments[d + 1];
  }
  return c;
}
;function ib(a) {
  if (a.ha && "function" == typeof a.ha) {
    return a.ha();
  }
  if (p(a)) {
    return a.split("");
  }
  if (ha(a)) {
    for (var b = [], c = a.length, d = 0;d < c;d++) {
      b.push(a[d]);
    }
    return b;
  }
  return eb(a);
}
;function jb(a, b) {
  this.b = {};
  this.a = [];
  this.c = 0;
  var c = arguments.length;
  if (1 < c) {
    if (c % 2) {
      throw Error("Uneven number of arguments");
    }
    for (var d = 0;d < c;d += 2) {
      this.ra(arguments[d], arguments[d + 1]);
    }
  } else {
    if (a) {
      if (a instanceof jb) {
        d = a.cb(), c = a.ha();
      } else {
        var c = [], f = 0;
        for (d in a) {
          c[f++] = d;
        }
        d = c;
        c = eb(a);
      }
      for (f = 0;f < d.length;f++) {
        this.ra(d[f], c[f]);
      }
    }
  }
}
e = jb.prototype;
e.ha = function() {
  kb(this);
  for (var a = [], b = 0;b < this.a.length;b++) {
    a.push(this.b[this.a[b]]);
  }
  return a;
};
e.cb = function() {
  kb(this);
  return this.a.concat();
};
e.clear = function() {
  this.b = {};
  this.c = this.a.length = 0;
};
e.remove = function(a) {
  return lb(this.b, a) ? (delete this.b[a], this.c--, this.a.length > 2 * this.c && kb(this), !0) : !1;
};
function kb(a) {
  if (a.c != a.a.length) {
    for (var b = 0, c = 0;b < a.a.length;) {
      var d = a.a[b];
      lb(a.b, d) && (a.a[c++] = d);
      b++;
    }
    a.a.length = c;
  }
  if (a.c != a.a.length) {
    for (var f = {}, c = b = 0;b < a.a.length;) {
      d = a.a[b], lb(f, d) || (a.a[c++] = d, f[d] = 1), b++;
    }
    a.a.length = c;
  }
}
function mb(a, b) {
  return lb(a.b, b) ? a.b[b] : void 0;
}
e.ra = function(a, b) {
  lb(this.b, a) || (this.c++, this.a.push(a));
  this.b[a] = b;
};
e.forEach = function(a, b) {
  for (var c = this.cb(), d = 0;d < c.length;d++) {
    var f = c[d];
    a.call(b, mb(this, f), f, this);
  }
};
e.clone = function() {
  return new jb(this);
};
function lb(a, b) {
  return Object.prototype.hasOwnProperty.call(a, b);
}
;var nb = /^(?:([^:/?#.]+):)?(?:\/\/(?:([^/?#]*)@)?([^/#?]*?)(?::([0-9]+))?(?=[/#?]|$))?([^?#]+)?(?:\?([^#]*))?(?:#(.*))?$/;
function ob(a, b) {
  if (a) {
    for (var c = a.split("&"), d = 0;d < c.length;d++) {
      var f = c[d].indexOf("="), g = null, h = null;
      0 <= f ? (g = c[d].substring(0, f), h = c[d].substring(f + 1)) : g = c[d];
      b(g, h ? decodeURIComponent(h.replace(/\+/g, " ")) : "");
    }
  }
}
;function pb(a, b) {
  this.j = this.G = this.c = "";
  this.o = null;
  this.l = this.h = "";
  this.a = !1;
  var c;
  a instanceof pb ? (this.a = n(b) ? b : a.a, qb(this, a.c), this.G = a.G, this.j = a.j, rb(this, a.o), this.h = a.h, sb(this, a.b.clone()), this.l = a.l) : a && (c = String(a).match(nb)) ? (this.a = !!b, qb(this, c[1] || "", !0), this.G = tb(c[2] || ""), this.j = tb(c[3] || "", !0), rb(this, c[4]), this.h = tb(c[5] || "", !0), sb(this, c[6] || "", !0), this.l = tb(c[7] || "")) : (this.a = !!b, this.b = new ub(null, 0, this.a));
}
pb.prototype.toString = function() {
  var a = [], b = this.c;
  b && a.push(vb(b, wb, !0), ":");
  var c = this.j;
  if (c || "file" == b) {
    a.push("//"), (b = this.G) && a.push(vb(b, wb, !0), "@"), a.push(encodeURIComponent(String(c)).replace(/%25([0-9a-fA-F]{2})/g, "%$1")), c = this.o, null != c && a.push(":", String(c));
  }
  if (c = this.h) {
    this.j && "/" != c.charAt(0) && a.push("/"), a.push(vb(c, "/" == c.charAt(0) ? xb : yb, !0));
  }
  (c = this.b.toString()) && a.push("?", c);
  (c = this.l) && a.push("#", vb(c, zb));
  return a.join("");
};
pb.prototype.clone = function() {
  return new pb(this);
};
function qb(a, b, c) {
  a.c = c ? tb(b, !0) : b;
  a.c && (a.c = a.c.replace(/:$/, ""));
}
function rb(a, b) {
  if (b) {
    b = Number(b);
    if (isNaN(b) || 0 > b) {
      throw Error("Bad port number " + b);
    }
    a.o = b;
  } else {
    a.o = null;
  }
}
function sb(a, b, c) {
  b instanceof ub ? (a.b = b, Ab(a.b, a.a)) : (c || (b = vb(b, Bb)), a.b = new ub(b, 0, a.a));
}
function tb(a, b) {
  return a ? b ? decodeURI(a.replace(/%25/g, "%2525")) : decodeURIComponent(a) : "";
}
function vb(a, b, c) {
  return p(a) ? (a = encodeURI(a).replace(b, Cb), c && (a = a.replace(/%25([0-9a-fA-F]{2})/g, "%$1")), a) : null;
}
function Cb(a) {
  a = a.charCodeAt(0);
  return "%" + (a >> 4 & 15).toString(16) + (a & 15).toString(16);
}
var wb = /[#\/\?@]/g, yb = /[\#\?:]/g, xb = /[\#\?]/g, Bb = /[\#\?@]/g, zb = /#/g;
function ub(a, b, c) {
  this.c = this.a = null;
  this.b = a || null;
  this.j = !!c;
}
function Db(a) {
  a.a || (a.a = new jb, a.c = 0, a.b && ob(a.b, function(b, c) {
    a.add(decodeURIComponent(b.replace(/\+/g, " ")), c);
  }));
}
e = ub.prototype;
e.add = function(a, b) {
  Db(this);
  this.b = null;
  a = Eb(this, a);
  var c = mb(this.a, a);
  c || this.a.ra(a, c = []);
  c.push(b);
  this.c++;
  return this;
};
e.remove = function(a) {
  Db(this);
  a = Eb(this, a);
  return lb(this.a.b, a) ? (this.b = null, this.c -= mb(this.a, a).length, this.a.remove(a)) : !1;
};
e.clear = function() {
  this.a = this.b = null;
  this.c = 0;
};
e.cb = function() {
  Db(this);
  for (var a = this.a.ha(), b = this.a.cb(), c = [], d = 0;d < b.length;d++) {
    for (var f = a[d], g = 0;g < f.length;g++) {
      c.push(b[d]);
    }
  }
  return c;
};
e.ha = function(a) {
  Db(this);
  var b = [];
  if (p(a)) {
    var c = a;
    Db(this);
    c = Eb(this, c);
    lb(this.a.b, c) && (b = Za(b, mb(this.a, Eb(this, a))));
  } else {
    for (a = this.a.ha(), c = 0;c < a.length;c++) {
      b = Za(b, a[c]);
    }
  }
  return b;
};
e.toString = function() {
  if (this.b) {
    return this.b;
  }
  if (!this.a) {
    return "";
  }
  for (var a = [], b = this.a.cb(), c = 0;c < b.length;c++) {
    for (var d = b[c], f = encodeURIComponent(String(d)), d = this.ha(d), g = 0;g < d.length;g++) {
      var h = f;
      "" !== d[g] && (h += "=" + encodeURIComponent(String(d[g])));
      a.push(h);
    }
  }
  return this.b = a.join("&");
};
e.clone = function() {
  var a = new ub;
  a.b = this.b;
  this.a && (a.a = this.a.clone(), a.c = this.c);
  return a;
};
function Eb(a, b) {
  var c = String(b);
  a.j && (c = c.toLowerCase());
  return c;
}
function Ab(a, b) {
  b && !a.j && (Db(a), a.b = null, a.a.forEach(function(a, b) {
    var f = b.toLowerCase();
    b != f && (this.remove(b), this.remove(f), 0 < a.length && (this.b = null, this.a.ra(Eb(this, f), $a(a)), this.c += a.length));
  }, a));
  a.j = b;
}
;function Fb() {
  this.a = "";
}
Fb.prototype.b = function() {
  return this.a;
};
Fb.prototype.toString = function() {
  return "SafeStyle{" + this.a + "}";
};
function Gb(a) {
  var b = new Fb;
  b.a = a;
  return b;
}
Gb("");
function Hb() {
  this.a = "";
  this.c = Ib;
  this.j = null;
}
Hb.prototype.b = function() {
  return this.a;
};
Hb.prototype.toString = function() {
  return "SafeHtml{" + this.a + "}";
};
function Jb(a) {
  if (a instanceof Hb && a.constructor === Hb && a.c === Ib) {
    return a.a;
  }
  Oa("expected object of type SafeHtml, got '" + a + "'");
  return "type_error:SafeHtml";
}
var Ib = {};
function Kb(a, b) {
  var c = new Hb;
  c.a = a;
  c.j = b;
  return c;
}
Kb("<!DOCTYPE html>", 0);
var Lb = Kb("", 0);
function Mb(a) {
  this.a = new jb;
  if (a) {
    a = ib(a);
    for (var b = a.length, c = 0;c < b;c++) {
      this.add(a[c]);
    }
  }
}
function Nb(a) {
  var b = typeof a;
  return "object" == b && a || "function" == b ? "o" + u(a) : b.substr(0, 1) + a;
}
e = Mb.prototype;
e.add = function(a) {
  this.a.ra(Nb(a), a);
};
e.remove = function(a) {
  return this.a.remove(Nb(a));
};
e.clear = function() {
  this.a.clear();
};
e.contains = function(a) {
  a = Nb(a);
  return lb(this.a.b, a);
};
e.ha = function() {
  return this.a.ha();
};
e.clone = function() {
  return new Mb(this);
};
var Ob;
a: {
  var Pb = m.navigator;
  if (Pb) {
    var Qb = Pb.userAgent;
    if (Qb) {
      Ob = Qb;
      break a;
    }
  }
  Ob = "";
}
function C(a) {
  return -1 != Ob.indexOf(a);
}
;var Rb = C("Opera") || C("OPR"), E = C("Trident") || C("MSIE"), Sb = C("Edge"), F = C("Gecko") && !(-1 != Ob.toLowerCase().indexOf("webkit") && !C("Edge")) && !(C("Trident") || C("MSIE")) && !C("Edge"), G = -1 != Ob.toLowerCase().indexOf("webkit") && !C("Edge"), Tb = C("Macintosh");
function Ub() {
  var a = Ob;
  if (F) {
    return /rv\:([^\);]+)(\)|;)/.exec(a);
  }
  if (Sb) {
    return /Edge\/([\d\.]+)/.exec(a);
  }
  if (E) {
    return /\b(?:MSIE|rv)[: ]([^\);]+)(\)|;)/.exec(a);
  }
  if (G) {
    return /WebKit\/(\S+)/.exec(a);
  }
}
function Vb() {
  var a = m.document;
  return a ? a.documentMode : void 0;
}
var Wb = function() {
  if (Rb && m.opera) {
    var a;
    var b = m.opera.version;
    try {
      a = b();
    } catch (c) {
      a = b;
    }
    return a;
  }
  a = "";
  (b = Ub()) && (a = b ? b[1] : "");
  return E && (b = Vb(), b > parseFloat(a)) ? String(b) : a;
}(), Xb = {};
function H(a) {
  var b;
  if (!(b = Xb[a])) {
    b = 0;
    for (var c = Aa(String(Wb)).split("."), d = Aa(String(a)).split("."), f = Math.max(c.length, d.length), g = 0;0 == b && g < f;g++) {
      var h = c[g] || "", k = d[g] || "", l = /(\d*)(\D*)/g, q = /(\d*)(\D*)/g;
      do {
        var t = l.exec(h) || ["", "", ""], y = q.exec(k) || ["", "", ""];
        if (0 == t[0].length && 0 == y[0].length) {
          break;
        }
        b = Ka(0 == t[1].length ? 0 : parseInt(t[1], 10), 0 == y[1].length ? 0 : parseInt(y[1], 10)) || Ka(0 == t[2].length, 0 == y[2].length) || Ka(t[2], y[2]);
      } while (0 == b);
    }
    b = Xb[a] = 0 <= b;
  }
  return b;
}
var Yb = m.document, Zb = Yb && E ? Vb() || ("CSS1Compat" == Yb.compatMode ? parseInt(Wb, 10) : 5) : void 0;
function $b(a, b, c, d, f) {
  this.reset(a, b, c, d, f);
}
$b.prototype.a = null;
var ac = 0;
$b.prototype.reset = function(a, b, c, d, f) {
  "number" == typeof f || ac++;
  this.j = d || pa();
  this.l = a;
  this.c = b;
  this.b = c;
  delete this.a;
};
function bc(a) {
  this.l = a;
  this.a = this.c = this.j = this.b = null;
}
function cc(a, b) {
  this.name = a;
  this.value = b;
}
cc.prototype.toString = function() {
  return this.name;
};
var dc = new cc("SHOUT", 1200), ec = new cc("SEVERE", 1E3), fc = new cc("WARNING", 900), gc = new cc("INFO", 800), hc = new cc("CONFIG", 700), ic = new cc("FINE", 500), jc = new cc("FINER", 400), kc = new cc("FINEST", 300);
function lc(a) {
  if (a.j) {
    return a.j;
  }
  if (a.b) {
    return lc(a.b);
  }
  Oa("Root logger has no level set.");
  return null;
}
bc.prototype.log = function(a, b, c) {
  if (a.value >= lc(this).value) {
    for (r(b) && (b = b()), a = new $b(a, String(b), this.l), c && (a.a = c), c = "log:" + a.c, m.console && (m.console.timeStamp ? m.console.timeStamp(c) : m.console.markTimeline && m.console.markTimeline(c)), m.msWriteProfilerMark && m.msWriteProfilerMark(c), c = this;c;) {
      b = c;
      var d = a;
      if (b.a) {
        for (var f = 0, g = void 0;g = b.a[f];f++) {
          g(d);
        }
      }
      c = c.b;
    }
  }
};
function mc(a, b) {
  a.log(jc, b, void 0);
}
var nc = {}, oc = null;
function pc() {
  oc || (oc = new bc(""), nc[""] = oc, oc.j = hc);
}
function qc(a) {
  pc();
  var b;
  if (!(b = nc[a])) {
    b = new bc(a);
    var c = a.lastIndexOf("."), d = a.substr(c + 1), c = qc(a.substr(0, c));
    c.c || (c.c = {});
    c.c[d] = b;
    b.b = c;
    nc[a] = b;
  }
  return b;
}
;function rc() {
  this.a = pa();
}
var sc = new rc;
rc.prototype.reset = function() {
  this.a = pa();
};
function tc(a) {
  this.j = a || "";
  this.l = sc;
}
tc.prototype.a = !0;
tc.prototype.b = !0;
tc.prototype.c = !1;
function uc(a) {
  return 10 > a ? "0" + a : String(a);
}
function vc(a) {
  tc.call(this, a);
}
w(vc, tc);
function wc() {
  this.j = v(this.l, this);
  this.a = new vc;
  this.a.b = !1;
  this.a.c = !1;
  this.b = this.a.a = !1;
  this.c = "";
  this.h = {};
}
function xc(a, b) {
  if (b != a.b) {
    var c;
    pc();
    c = oc;
    if (b) {
      var d = a.j;
      c.a || (c.a = []);
      c.a.push(d);
    } else {
      (c = c.a) && Ya(c, a.j);
    }
    a.b = b;
  }
}
wc.prototype.l = function(a) {
  if (!this.h[a.b]) {
    var b;
    b = this.a;
    var c = [];
    c.push(b.j, " ");
    if (b.b) {
      var d = new Date(a.j);
      c.push("[", uc(d.getFullYear() - 2E3) + uc(d.getMonth() + 1) + uc(d.getDate()) + " " + uc(d.getHours()) + ":" + uc(d.getMinutes()) + ":" + uc(d.getSeconds()) + "." + uc(Math.floor(d.getMilliseconds() / 10)), "] ");
    }
    var d = (a.j - b.l.a) / 1E3, f = d.toFixed(3), g = 0;
    if (1 > d) {
      g = 2;
    } else {
      for (;100 > d;) {
        g++, d *= 10;
      }
    }
    for (;0 < g--;) {
      f = " " + f;
    }
    c.push("[", f, "s] ");
    c.push("[", a.b, "] ");
    c.push(a.c);
    b.c && (d = a.a) && c.push("\n", d instanceof Error ? d.message : d.toString());
    b.a && c.push("\n");
    b = c.join("");
    if (c = yc) {
      switch(a.l) {
        case dc:
          zc(c, "info", b);
          break;
        case ec:
          zc(c, "error", b);
          break;
        case fc:
          zc(c, "warn", b);
          break;
        default:
          zc(c, "debug", b);
      }
    } else {
      this.c += b;
    }
  }
};
var yc = m.console;
function zc(a, b, c) {
  if (a[b]) {
    a[b](c);
  } else {
    a.log(c);
  }
}
;var Ac = !E || 9 <= Zb, Bc = !E || 9 <= Zb, Cc = E && !H("9");
!G || H("528");
F && H("1.9b") || E && H("8") || Rb && H("9.5") || G && H("528");
F && !H("8") || E && H("9");
function I(a, b) {
  this.type = a;
  this.l = this.target = b;
  this.h = !1;
  this.Uc = !0;
}
I.prototype.o = function() {
  this.h = !0;
};
I.prototype.b = function() {
  this.Uc = !1;
};
function Dc(a) {
  Dc[" "](a);
  return a;
}
Dc[" "] = da;
function J(a, b) {
  I.call(this, a ? a.type : "");
  this.j = this.l = this.target = null;
  this.a = this.clientY = this.clientX = 0;
  this.metaKey = this.shiftKey = this.altKey = this.ctrlKey = !1;
  this.state = null;
  this.G = !1;
  this.c = null;
  if (a) {
    var c = this.type = a.type, d = a.changedTouches ? a.changedTouches[0] : null;
    this.target = a.target || a.srcElement;
    this.l = b;
    var f = a.relatedTarget;
    if (f) {
      if (F) {
        var g;
        a: {
          try {
            Dc(f.nodeName);
            g = !0;
            break a;
          } catch (h) {
          }
          g = !1;
        }
        g || (f = null);
      }
    } else {
      "mouseover" == c ? f = a.fromElement : "mouseout" == c && (f = a.toElement);
    }
    this.j = f;
    null === d ? (this.clientX = void 0 !== a.clientX ? a.clientX : a.pageX, this.clientY = void 0 !== a.clientY ? a.clientY : a.pageY) : (this.clientX = void 0 !== d.clientX ? d.clientX : d.pageX, this.clientY = void 0 !== d.clientY ? d.clientY : d.pageY);
    this.a = a.keyCode || 0;
    this.ctrlKey = a.ctrlKey;
    this.altKey = a.altKey;
    this.shiftKey = a.shiftKey;
    this.metaKey = a.metaKey;
    this.G = Tb ? a.metaKey : a.ctrlKey;
    this.state = a.state;
    this.c = a;
    a.defaultPrevented && this.b();
  }
}
w(J, I);
var Ec = [1, 4, 2];
function Fc(a) {
  return (Ac ? 0 == a.c.button : "click" == a.type ? !0 : !!(a.c.button & Ec[0])) && !(G && Tb && a.ctrlKey);
}
J.prototype.o = function() {
  J.m.o.call(this);
  this.c.stopPropagation ? this.c.stopPropagation() : this.c.cancelBubble = !0;
};
J.prototype.b = function() {
  J.m.b.call(this);
  var a = this.c;
  if (a.preventDefault) {
    a.preventDefault();
  } else {
    if (a.returnValue = !1, Cc) {
      try {
        if (a.ctrlKey || 112 <= a.keyCode && 123 >= a.keyCode) {
          a.keyCode = -1;
        }
      } catch (b) {
      }
    }
  }
};
var Gc = "closure_listenable_" + (1E6 * Math.random() | 0);
function Hc(a) {
  return !(!a || !a[Gc]);
}
var Ic = 0;
function Jc(a, b, c, d, f) {
  this.listener = a;
  this.a = null;
  this.src = b;
  this.type = c;
  this.tb = !!d;
  this.Db = f;
  this.key = ++Ic;
  this.Ya = this.sb = !1;
}
function Kc(a) {
  a.Ya = !0;
  a.listener = null;
  a.a = null;
  a.src = null;
  a.Db = null;
}
;function Lc(a) {
  this.src = a;
  this.a = {};
  this.b = 0;
}
Lc.prototype.add = function(a, b, c, d, f) {
  var g = a.toString();
  a = this.a[g];
  a || (a = this.a[g] = [], this.b++);
  var h = Mc(a, b, d, f);
  -1 < h ? (b = a[h], c || (b.sb = !1)) : (b = new Jc(b, this.src, g, !!d, f), b.sb = c, a.push(b));
  return b;
};
Lc.prototype.remove = function(a, b, c, d) {
  a = a.toString();
  if (!(a in this.a)) {
    return !1;
  }
  var f = this.a[a];
  b = Mc(f, b, c, d);
  return -1 < b ? (Kc(f[b]), A.splice.call(f, b, 1), 0 == f.length && (delete this.a[a], this.b--), !0) : !1;
};
function Nc(a, b) {
  var c = b.type;
  if (!(c in a.a)) {
    return !1;
  }
  var d = Ya(a.a[c], b);
  d && (Kc(b), 0 == a.a[c].length && (delete a.a[c], a.b--));
  return d;
}
function Oc(a, b, c, d, f) {
  a = a.a[b.toString()];
  b = -1;
  a && (b = Mc(a, c, d, f));
  return -1 < b ? a[b] : null;
}
function Mc(a, b, c, d) {
  for (var f = 0;f < a.length;++f) {
    var g = a[f];
    if (!g.Ya && g.listener == b && g.tb == !!c && g.Db == d) {
      return f;
    }
  }
  return -1;
}
;var Pc = "closure_lm_" + (1E6 * Math.random() | 0), Qc = {}, Rc = 0;
function K(a, b, c, d, f) {
  if (ga(b)) {
    for (var g = 0;g < b.length;g++) {
      K(a, b[g], c, d, f);
    }
    return null;
  }
  c = Sc(c);
  return Hc(a) ? a.w(b, c, d, f) : Tc(a, b, c, !1, d, f);
}
function Tc(a, b, c, d, f, g) {
  if (!b) {
    throw Error("Invalid event type");
  }
  var h = !!f, k = Uc(a);
  k || (a[Pc] = k = new Lc(a));
  c = k.add(b, c, d, f, g);
  if (c.a) {
    return c;
  }
  d = Vc();
  c.a = d;
  d.src = a;
  d.listener = c;
  if (a.addEventListener) {
    a.addEventListener(b.toString(), d, h);
  } else {
    if (a.attachEvent) {
      a.attachEvent(Wc(b.toString()), d);
    } else {
      throw Error("addEventListener and attachEvent are unavailable.");
    }
  }
  Rc++;
  return c;
}
function Vc() {
  var a = Xc, b = Bc ? function(c) {
    return a.call(b.src, b.listener, c);
  } : function(c) {
    c = a.call(b.src, b.listener, c);
    if (!c) {
      return c;
    }
  };
  return b;
}
function Yc(a, b, c, d, f) {
  if (ga(b)) {
    for (var g = 0;g < b.length;g++) {
      Yc(a, b[g], c, d, f);
    }
  } else {
    c = Sc(c), Hc(a) ? a.qa.add(String(b), c, !0, d, f) : Tc(a, b, c, !0, d, f);
  }
}
function Zc(a, b, c, d, f) {
  if (ga(b)) {
    for (var g = 0;g < b.length;g++) {
      Zc(a, b[g], c, d, f);
    }
  } else {
    c = Sc(c), Hc(a) ? a.ma(b, c, d, f) : a && (a = Uc(a)) && (b = Oc(a, b, c, !!d, f)) && $c(b);
  }
}
function $c(a) {
  if ("number" == typeof a || !a || a.Ya) {
    return !1;
  }
  var b = a.src;
  if (Hc(b)) {
    return Nc(b.qa, a);
  }
  var c = a.type, d = a.a;
  b.removeEventListener ? b.removeEventListener(c, d, a.tb) : b.detachEvent && b.detachEvent(Wc(c), d);
  Rc--;
  (c = Uc(b)) ? (Nc(c, a), 0 == c.b && (c.src = null, b[Pc] = null)) : Kc(a);
  return !0;
}
function ad(a) {
  if (a) {
    if (Hc(a)) {
      a.lb(void 0);
    } else {
      if (a = Uc(a)) {
        var b = 0, c;
        for (c in a.a) {
          for (var d = a.a[c].concat(), f = 0;f < d.length;++f) {
            $c(d[f]) && ++b;
          }
        }
      }
    }
  }
}
function Wc(a) {
  return a in Qc ? Qc[a] : Qc[a] = "on" + a;
}
function bd(a, b, c, d) {
  var f = !0;
  if (a = Uc(a)) {
    if (b = a.a[b.toString()]) {
      for (b = b.concat(), a = 0;a < b.length;a++) {
        var g = b[a];
        g && g.tb == c && !g.Ya && (g = cd(g, d), f = f && !1 !== g);
      }
    }
  }
  return f;
}
function cd(a, b) {
  var c = a.listener, d = a.Db || a.src;
  a.sb && $c(a);
  return c.call(d, b);
}
function Xc(a, b) {
  if (a.Ya) {
    return !0;
  }
  if (!Bc) {
    var c;
    if (!(c = b)) {
      a: {
        c = ["window", "event"];
        for (var d = m, f;f = c.shift();) {
          if (null != d[f]) {
            d = d[f];
          } else {
            c = null;
            break a;
          }
        }
        c = d;
      }
    }
    f = c;
    c = new J(f, this);
    d = !0;
    if (!(0 > f.keyCode || void 0 != f.returnValue)) {
      a: {
        var g = !1;
        if (0 == f.keyCode) {
          try {
            f.keyCode = -1;
            break a;
          } catch (h) {
            g = !0;
          }
        }
        if (g || void 0 == f.returnValue) {
          f.returnValue = !0;
        }
      }
      f = [];
      for (g = c.l;g;g = g.parentNode) {
        f.push(g);
      }
      for (var g = a.type, k = f.length - 1;!c.h && 0 <= k;k--) {
        c.l = f[k];
        var l = bd(f[k], g, !0, c), d = d && l;
      }
      for (k = 0;!c.h && k < f.length;k++) {
        c.l = f[k], l = bd(f[k], g, !1, c), d = d && l;
      }
    }
    return d;
  }
  return cd(a, new J(b, this));
}
function Uc(a) {
  a = a[Pc];
  return a instanceof Lc ? a : null;
}
var dd = "__closure_events_fn_" + (1E9 * Math.random() >>> 0);
function Sc(a) {
  if (r(a)) {
    return a;
  }
  a[dd] || (a[dd] = function(b) {
    return a.handleEvent(b);
  });
  return a[dd];
}
;function ed(a, b) {
  a && a.log(fc, b, void 0);
}
function fd(a, b) {
  a && a.log(gc, b, void 0);
}
;var gd = !E || 9 <= Zb, hd = !F && !E || E && 9 <= Zb || F && H("1.9.1"), id = E && !H("9");
function L(a, b) {
  this.x = n(a) ? a : 0;
  this.y = n(b) ? b : 0;
}
e = L.prototype;
e.clone = function() {
  return new L(this.x, this.y);
};
e.toString = function() {
  return "(" + this.x + ", " + this.y + ")";
};
function jd(a, b) {
  return new L(a.x - b.x, a.y - b.y);
}
e.ceil = function() {
  this.x = Math.ceil(this.x);
  this.y = Math.ceil(this.y);
  return this;
};
e.floor = function() {
  this.x = Math.floor(this.x);
  this.y = Math.floor(this.y);
  return this;
};
e.round = function() {
  this.x = Math.round(this.x);
  this.y = Math.round(this.y);
  return this;
};
function kd(a, b) {
  this.width = a;
  this.height = b;
}
e = kd.prototype;
e.clone = function() {
  return new kd(this.width, this.height);
};
e.toString = function() {
  return "(" + this.width + " x " + this.height + ")";
};
e.ceil = function() {
  this.width = Math.ceil(this.width);
  this.height = Math.ceil(this.height);
  return this;
};
e.floor = function() {
  this.width = Math.floor(this.width);
  this.height = Math.floor(this.height);
  return this;
};
e.round = function() {
  this.width = Math.round(this.width);
  this.height = Math.round(this.height);
  return this;
};
function N(a) {
  return a ? new ld(O(a)) : ya || (ya = new ld);
}
function md(a, b) {
  cb(b, function(b, d) {
    "style" == d ? a.style.cssText = b : "class" == d ? a.className = b : "for" == d ? a.htmlFor = b : nd.hasOwnProperty(d) ? a.setAttribute(nd[d], b) : 0 == d.lastIndexOf("aria-", 0) || 0 == d.lastIndexOf("data-", 0) ? a.setAttribute(d, b) : a[d] = b;
  });
}
var nd = {cellpadding:"cellPadding", cellspacing:"cellSpacing", colspan:"colSpan", frameborder:"frameBorder", height:"height", maxlength:"maxLength", role:"role", rowspan:"rowSpan", type:"type", usemap:"useMap", valign:"vAlign", width:"width"};
function od(a) {
  a = a.document;
  a = "CSS1Compat" == a.compatMode ? a.documentElement : a.body;
  return new kd(a.clientWidth, a.clientHeight);
}
function pd(a) {
  return a.scrollingElement ? a.scrollingElement : G || "CSS1Compat" != a.compatMode ? a.body || a.documentElement : a.documentElement;
}
function qd(a) {
  return a ? rd(a) : window;
}
function rd(a) {
  return a.parentWindow || a.defaultView;
}
function sd(a, b, c) {
  return td(document, arguments);
}
function td(a, b) {
  var c = b[0], d = b[1];
  if (!gd && d && (d.name || d.type)) {
    c = ["<", c];
    d.name && c.push(' name="', Ba(d.name), '"');
    if (d.type) {
      c.push(' type="', Ba(d.type), '"');
      var f = {};
      gb(f, d);
      delete f.type;
      d = f;
    }
    c.push(">");
    c = c.join("");
  }
  c = a.createElement(c);
  d && (p(d) ? c.className = d : ga(d) ? c.className = d.join(" ") : md(c, d));
  2 < b.length && ud(a, c, b, 2);
  return c;
}
function ud(a, b, c, d) {
  function f(c) {
    c && b.appendChild(p(c) ? a.createTextNode(c) : c);
  }
  for (;d < c.length;d++) {
    var g = c[d];
    !ha(g) || ia(g) && 0 < g.nodeType ? f(g) : B(vd(g) ? $a(g) : g, f);
  }
}
function wd(a, b) {
  ud(O(a), a, arguments, 1);
}
function xd(a) {
  for (var b;b = a.firstChild;) {
    a.removeChild(b);
  }
}
function yd(a) {
  return a && a.parentNode ? a.parentNode.removeChild(a) : null;
}
function zd(a, b) {
  if (a.contains && 1 == b.nodeType) {
    return a == b || a.contains(b);
  }
  if ("undefined" != typeof a.compareDocumentPosition) {
    return a == b || Boolean(a.compareDocumentPosition(b) & 16);
  }
  for (;b && a != b;) {
    b = b.parentNode;
  }
  return b == a;
}
function O(a) {
  return 9 == a.nodeType ? a : a.ownerDocument || a.document;
}
function Ad(a, b) {
  if ("textContent" in a) {
    a.textContent = b;
  } else {
    if (3 == a.nodeType) {
      a.data = b;
    } else {
      if (a.firstChild && 3 == a.firstChild.nodeType) {
        for (;a.lastChild != a.firstChild;) {
          a.removeChild(a.lastChild);
        }
        a.firstChild.data = b;
      } else {
        xd(a), a.appendChild(O(a).createTextNode(String(b)));
      }
    }
  }
}
var Bd = {SCRIPT:1, STYLE:1, HEAD:1, IFRAME:1, OBJECT:1}, Cd = {IMG:" ", BR:"\n"};
function Dd(a, b) {
  b ? a.tabIndex = 0 : (a.tabIndex = -1, a.removeAttribute("tabIndex"));
}
function Ed(a) {
  a = a.getAttributeNode("tabindex");
  return null != a && a.specified;
}
function Fd(a) {
  a = a.tabIndex;
  return "number" == typeof a && 0 <= a && 32768 > a;
}
function Gd(a) {
  var b = [];
  Hd(a, b, !1);
  return b.join("");
}
function Hd(a, b, c) {
  if (!(a.nodeName in Bd)) {
    if (3 == a.nodeType) {
      c ? b.push(String(a.nodeValue).replace(/(\r\n|\r|\n)/g, "")) : b.push(a.nodeValue);
    } else {
      if (a.nodeName in Cd) {
        b.push(Cd[a.nodeName]);
      } else {
        for (a = a.firstChild;a;) {
          Hd(a, b, c), a = a.nextSibling;
        }
      }
    }
  }
}
function vd(a) {
  if (a && "number" == typeof a.length) {
    if (ia(a)) {
      return "function" == typeof a.item || "string" == typeof a.item;
    }
    if (r(a)) {
      return "function" == typeof a.item;
    }
  }
  return !1;
}
function ld(a) {
  this.a = a || m.document || document;
}
e = ld.prototype;
e.g = function(a) {
  return p(a) ? this.a.getElementById(a) : a;
};
e.C = function(a, b, c) {
  return td(this.a, arguments);
};
function Id(a) {
  return "CSS1Compat" == a.a.compatMode;
}
function Jd(a) {
  var b = a.a;
  a = pd(b);
  b = rd(b);
  return E && H("10") && b.pageYOffset != a.scrollTop ? new L(a.scrollLeft, a.scrollTop) : new L(b.pageXOffset || a.scrollLeft, b.pageYOffset || a.scrollTop);
}
e.wc = yd;
function Kd(a) {
  return hd && void 0 != a.children ? a.children : Ta(a.childNodes, function(a) {
    return 1 == a.nodeType;
  });
}
e.contains = zd;
e.Td = Ad;
function P(a, b, c, d) {
  this.top = a;
  this.right = b;
  this.bottom = c;
  this.left = d;
}
e = P.prototype;
e.clone = function() {
  return new P(this.top, this.right, this.bottom, this.left);
};
e.toString = function() {
  return "(" + this.top + "t, " + this.right + "r, " + this.bottom + "b, " + this.left + "l)";
};
e.contains = function(a) {
  return this && a ? a instanceof P ? a.left >= this.left && a.right <= this.right && a.top >= this.top && a.bottom <= this.bottom : a.x >= this.left && a.x <= this.right && a.y >= this.top && a.y <= this.bottom : !1;
};
function Ld(a, b) {
  var c = b.x < a.left ? b.x - a.left : b.x > a.right ? b.x - a.right : 0, d = b.y < a.top ? b.y - a.top : b.y > a.bottom ? b.y - a.bottom : 0;
  return Math.sqrt(c * c + d * d);
}
e.ceil = function() {
  this.top = Math.ceil(this.top);
  this.right = Math.ceil(this.right);
  this.bottom = Math.ceil(this.bottom);
  this.left = Math.ceil(this.left);
  return this;
};
e.floor = function() {
  this.top = Math.floor(this.top);
  this.right = Math.floor(this.right);
  this.bottom = Math.floor(this.bottom);
  this.left = Math.floor(this.left);
  return this;
};
e.round = function() {
  this.top = Math.round(this.top);
  this.right = Math.round(this.right);
  this.bottom = Math.round(this.bottom);
  this.left = Math.round(this.left);
  return this;
};
function Md(a, b, c, d) {
  this.left = a;
  this.top = b;
  this.width = c;
  this.height = d;
}
e = Md.prototype;
e.clone = function() {
  return new Md(this.left, this.top, this.width, this.height);
};
function Nd(a) {
  return new P(a.top, a.left + a.width, a.top + a.height, a.left);
}
e.toString = function() {
  return "(" + this.left + ", " + this.top + " - " + this.width + "w x " + this.height + "h)";
};
e.contains = function(a) {
  return a instanceof Md ? this.left <= a.left && this.left + this.width >= a.left + a.width && this.top <= a.top && this.top + this.height >= a.top + a.height : a.x >= this.left && a.x <= this.left + this.width && a.y >= this.top && a.y <= this.top + this.height;
};
e.ceil = function() {
  this.left = Math.ceil(this.left);
  this.top = Math.ceil(this.top);
  this.width = Math.ceil(this.width);
  this.height = Math.ceil(this.height);
  return this;
};
e.floor = function() {
  this.left = Math.floor(this.left);
  this.top = Math.floor(this.top);
  this.width = Math.floor(this.width);
  this.height = Math.floor(this.height);
  return this;
};
e.round = function() {
  this.left = Math.round(this.left);
  this.top = Math.round(this.top);
  this.width = Math.round(this.width);
  this.height = Math.round(this.height);
  return this;
};
function Od(a, b, c) {
  if (p(b)) {
    (b = Pd(a, b)) && (a.style[b] = c);
  } else {
    for (var d in b) {
      c = a;
      var f = b[d], g = Pd(c, d);
      g && (c.style[g] = f);
    }
  }
}
var Qd = {};
function Pd(a, b) {
  var c = Qd[b];
  if (!c) {
    var d = La(b), c = d;
    void 0 === a.style[d] && (d = (G ? "Webkit" : F ? "Moz" : E ? "ms" : Rb ? "O" : null) + Ma(d), void 0 !== a.style[d] && (c = d));
    Qd[b] = c;
  }
  return c;
}
function Rd(a, b) {
  var c = O(a);
  return c.defaultView && c.defaultView.getComputedStyle && (c = c.defaultView.getComputedStyle(a, null)) ? c[b] || c.getPropertyValue(b) || "" : "";
}
function Sd(a, b) {
  return Rd(a, b) || (a.currentStyle ? a.currentStyle[b] : null) || a.style && a.style[b];
}
function Td(a, b, c) {
  var d;
  b instanceof L ? (d = b.x, b = b.y) : (d = b, b = c);
  a.style.left = Ud(d, !1);
  a.style.top = Ud(b, !1);
}
function Vd(a) {
  a = a ? O(a) : document;
  return !E || 9 <= Zb || Id(N(a)) ? a.documentElement : a.body;
}
function Wd(a) {
  var b;
  try {
    b = a.getBoundingClientRect();
  } catch (c) {
    return {left:0, top:0, right:0, bottom:0};
  }
  E && a.ownerDocument.body && (a = a.ownerDocument, b.left -= a.documentElement.clientLeft + a.body.clientLeft, b.top -= a.documentElement.clientTop + a.body.clientTop);
  return b;
}
function Xd(a) {
  if (E && !(8 <= Zb)) {
    return a.offsetParent;
  }
  var b = O(a), c = Sd(a, "position"), d = "fixed" == c || "absolute" == c;
  for (a = a.parentNode;a && a != b;a = a.parentNode) {
    if (11 == a.nodeType && a.host && (a = a.host), c = Sd(a, "position"), d = d && "static" == c && a != b.documentElement && a != b.body, !d && (a.scrollWidth > a.clientWidth || a.scrollHeight > a.clientHeight || "fixed" == c || "absolute" == c || "relative" == c)) {
      return a;
    }
  }
  return null;
}
function Yd(a) {
  for (var b = new P(0, Infinity, Infinity, 0), c = N(a), d = c.a.body, f = c.a.documentElement, g = pd(c.a);a = Xd(a);) {
    if (!(E && 0 == a.clientWidth || G && 0 == a.clientHeight && a == d) && a != d && a != f && "visible" != Sd(a, "overflow")) {
      var h = Zd(a), k = new L(a.clientLeft, a.clientTop);
      h.x += k.x;
      h.y += k.y;
      b.top = Math.max(b.top, h.y);
      b.right = Math.min(b.right, h.x + a.clientWidth);
      b.bottom = Math.min(b.bottom, h.y + a.clientHeight);
      b.left = Math.max(b.left, h.x);
    }
  }
  d = g.scrollLeft;
  g = g.scrollTop;
  b.left = Math.max(b.left, d);
  b.top = Math.max(b.top, g);
  c = od(rd(c.a) || window);
  b.right = Math.min(b.right, d + c.width);
  b.bottom = Math.min(b.bottom, g + c.height);
  return 0 <= b.top && 0 <= b.left && b.bottom > b.top && b.right > b.left ? b : null;
}
function Zd(a) {
  var b = O(a), c = new L(0, 0), d = Vd(b);
  if (a == d) {
    return c;
  }
  a = Wd(a);
  b = Jd(N(b));
  c.x = a.left + b.x;
  c.y = a.top + b.y;
  return c;
}
function $d(a, b, c) {
  if (b instanceof kd) {
    c = b.height, b = b.width;
  } else {
    if (void 0 == c) {
      throw Error("missing height argument");
    }
  }
  a.style.width = Ud(b, !0);
  a.style.height = Ud(c, !0);
}
function Ud(a, b) {
  "number" == typeof a && (a = (b ? Math.round(a) : a) + "px");
  return a;
}
function ae(a) {
  var b = be;
  if ("none" != Sd(a, "display")) {
    return b(a);
  }
  var c = a.style, d = c.display, f = c.visibility, g = c.position;
  c.visibility = "hidden";
  c.position = "absolute";
  c.display = "inline";
  a = b(a);
  c.display = d;
  c.position = g;
  c.visibility = f;
  return a;
}
function be(a) {
  var b = a.offsetWidth, c = a.offsetHeight, d = G && !b && !c;
  return n(b) && !d || !a.getBoundingClientRect ? new kd(b, c) : (a = Wd(a), new kd(a.right - a.left, a.bottom - a.top));
}
function ce(a) {
  var b = Zd(a);
  a = ae(a);
  return new Md(b.x, b.y, a.width, a.height);
}
function de(a, b) {
  var c = a.style;
  "opacity" in c ? c.opacity = b : "MozOpacity" in c ? c.MozOpacity = b : "filter" in c && (c.filter = "" === b ? "" : "alpha(opacity=" + 100 * b + ")");
}
function Q(a, b) {
  a.style.display = b ? "" : "none";
}
function ee(a) {
  return "rtl" == Sd(a, "direction");
}
var fe = F ? "MozUserSelect" : G ? "WebkitUserSelect" : null;
function ge(a, b, c) {
  c = c ? null : a.getElementsByTagName("*");
  if (fe) {
    if (b = b ? "none" : "", a.style && (a.style[fe] = b), c) {
      a = 0;
      for (var d;d = c[a];a++) {
        d.style && (d.style[fe] = b);
      }
    }
  } else {
    if (E || Rb) {
      if (b = b ? "on" : "", a.setAttribute("unselectable", b), c) {
        for (a = 0;d = c[a];a++) {
          d.setAttribute("unselectable", b);
        }
      }
    }
  }
}
function he(a, b) {
  if (/^\d+px?$/.test(b)) {
    return parseInt(b, 10);
  }
  var c = a.style.left, d = a.runtimeStyle.left;
  a.runtimeStyle.left = a.currentStyle.left;
  a.style.left = b;
  var f = a.style.pixelLeft;
  a.style.left = c;
  a.runtimeStyle.left = d;
  return f;
}
function ie(a, b) {
  var c = a.currentStyle ? a.currentStyle[b] : null;
  return c ? he(a, c) : 0;
}
var je = {thin:2, medium:4, thick:6};
function ke(a, b) {
  if ("none" == (a.currentStyle ? a.currentStyle[b + "Style"] : null)) {
    return 0;
  }
  var c = a.currentStyle ? a.currentStyle[b + "Width"] : null;
  return c in je ? je[c] : he(a, c);
}
;function le(a) {
  ta.call(this);
  this.b = a;
  this.a = {};
}
w(le, ta);
var me = [];
le.prototype.w = function(a, b, c, d) {
  ga(b) || (b && (me[0] = b.toString()), b = me);
  for (var f = 0;f < b.length;f++) {
    var g = K(a, b[f], c || this.handleEvent, d || !1, this.b || this);
    if (!g) {
      break;
    }
    this.a[g.key] = g;
  }
  return this;
};
le.prototype.ma = function(a, b, c, d, f) {
  if (ga(b)) {
    for (var g = 0;g < b.length;g++) {
      this.ma(a, b[g], c, d, f);
    }
  } else {
    c = c || this.handleEvent, f = f || this.b || this, c = Sc(c), d = !!d, b = Hc(a) ? Oc(a.qa, String(b), c, d, f) : a ? (a = Uc(a)) ? Oc(a, b, c, d, f) : null : null, b && ($c(b), delete this.a[b.key]);
  }
  return this;
};
function ne(a) {
  cb(a.a, function(a, c) {
    this.a.hasOwnProperty(c) && $c(a);
  }, a);
  a.a = {};
}
le.prototype.v = function() {
  le.m.v.call(this);
  ne(this);
};
le.prototype.handleEvent = function() {
  throw Error("EventHandler.handleEvent not implemented");
};
function R() {
  ta.call(this);
  this.qa = new Lc(this);
  this.$c = this;
  this.qb = null;
}
w(R, ta);
R.prototype[Gc] = !0;
e = R.prototype;
e.lc = function(a) {
  this.qb = a;
};
e.addEventListener = function(a, b, c, d) {
  K(this, a, b, c, d);
};
e.removeEventListener = function(a, b, c, d) {
  Zc(this, a, b, c, d);
};
e.D = function(a) {
  var b, c = this.qb;
  if (c) {
    for (b = [];c;c = c.qb) {
      b.push(c);
    }
  }
  var c = this.$c, d = a.type || a;
  if (p(a)) {
    a = new I(a, c);
  } else {
    if (a instanceof I) {
      a.target = a.target || c;
    } else {
      var f = a;
      a = new I(d, c);
      gb(a, f);
    }
  }
  var f = !0, g;
  if (b) {
    for (var h = b.length - 1;!a.h && 0 <= h;h--) {
      g = a.l = b[h], f = oe(g, d, !0, a) && f;
    }
  }
  a.h || (g = a.l = c, f = oe(g, d, !0, a) && f, a.h || (f = oe(g, d, !1, a) && f));
  if (b) {
    for (h = 0;!a.h && h < b.length;h++) {
      g = a.l = b[h], f = oe(g, d, !1, a) && f;
    }
  }
  return f;
};
e.v = function() {
  R.m.v.call(this);
  this.lb();
  this.qb = null;
};
e.w = function(a, b, c, d) {
  return this.qa.add(String(a), b, !1, c, d);
};
e.ma = function(a, b, c, d) {
  return this.qa.remove(String(a), b, c, d);
};
e.lb = function(a) {
  var b;
  if (this.qa) {
    b = this.qa;
    a = a && a.toString();
    var c = 0, d;
    for (d in b.a) {
      if (!a || d == a) {
        for (var f = b.a[d], g = 0;g < f.length;g++) {
          ++c, Kc(f[g]);
        }
        delete b.a[d];
        b.b--;
      }
    }
    b = c;
  } else {
    b = 0;
  }
  return b;
};
function oe(a, b, c, d) {
  b = a.qa.a[String(b)];
  if (!b) {
    return !0;
  }
  b = b.concat();
  for (var f = !0, g = 0;g < b.length;++g) {
    var h = b[g];
    if (h && !h.Ya && h.tb == c) {
      var k = h.listener, l = h.Db || h.src;
      h.sb && Nc(a.qa, h);
      f = !1 !== k.call(l, d) && f;
    }
  }
  return f && 0 != d.Uc;
}
;function pe() {
}
ea(pe);
pe.prototype.a = 0;
function S(a) {
  R.call(this);
  this.a = a || N();
  this.Ea = qe;
  this.oa = null;
  this.K = !1;
  this.b = null;
  this.M = void 0;
  this.G = this.j = this.l = null;
}
w(S, R);
S.prototype.ab = pe.Ga();
var qe = null;
function re(a, b) {
  switch(a) {
    case 1:
      return b ? "disable" : "enable";
    case 2:
      return b ? "highlight" : "unhighlight";
    case 4:
      return b ? "activate" : "deactivate";
    case 8:
      return b ? "select" : "unselect";
    case 16:
      return b ? "check" : "uncheck";
    case 32:
      return b ? "focus" : "blur";
    case 64:
      return b ? "open" : "close";
  }
  throw Error("Invalid component state");
}
e = S.prototype;
e.P = function() {
  return this.oa || (this.oa = ":" + (this.ab.a++).toString(36));
};
e.g = function() {
  return this.b;
};
function T(a) {
  a.M || (a.M = new le(a));
  return a.M;
}
function se(a, b) {
  if (a == b) {
    throw Error("Unable to set parent component");
  }
  if (b && a.l && a.oa && te(a.l, a.oa) && a.l != b) {
    throw Error("Unable to set parent component");
  }
  a.l = b;
  S.m.lc.call(a, b);
}
e.lc = function(a) {
  if (this.l && this.l != a) {
    throw Error("Method not supported");
  }
  S.m.lc.call(this, a);
};
e.J = function() {
  this.b = this.a.a.createElement("DIV");
};
function ue(a, b, c) {
  if (a.K) {
    throw Error("Component already rendered");
  }
  a.b || a.J();
  b ? b.insertBefore(a.b, c || null) : a.a.a.body.appendChild(a.b);
  a.l && !a.l.K || a.U();
}
e.U = function() {
  this.K = !0;
  ve(this, function(a) {
    !a.K && a.g() && a.U();
  });
};
e.da = function() {
  ve(this, function(a) {
    a.K && a.da();
  });
  this.M && ne(this.M);
  this.K = !1;
};
e.v = function() {
  this.K && this.da();
  this.M && (this.M.O(), delete this.M);
  ve(this, function(a) {
    a.O();
  });
  this.b && yd(this.b);
  this.l = this.b = this.G = this.j = null;
  S.m.v.call(this);
};
e.ka = function(a, b) {
  this.rb(a, we(this), b);
};
e.rb = function(a, b, c) {
  if (a.K && (c || !this.K)) {
    throw Error("Component already rendered");
  }
  if (0 > b || b > we(this)) {
    throw Error("Child component index out of bounds");
  }
  this.G && this.j || (this.G = {}, this.j = []);
  if (a.l == this) {
    var d = a.P();
    this.G[d] = a;
    Ya(this.j, a);
  } else {
    var d = this.G, f = a.P();
    if (null !== d && f in d) {
      throw Error('The object already contains the key "' + f + '"');
    }
    d[f] = a;
  }
  se(a, this);
  ab(this.j, b, 0, a);
  a.K && this.K && a.l == this ? (c = this.Ha(), b = c.childNodes[b] || null, b != a.g() && c.insertBefore(a.g(), b)) : c ? (this.b || this.J(), b = U(this, b + 1), ue(a, this.Ha(), b ? b.b : null)) : this.K && !a.K && a.b && a.b.parentNode && 1 == a.b.parentNode.nodeType && a.U();
};
e.Ha = function() {
  return this.b;
};
function xe(a) {
  null == a.Ea && (a.Ea = ee(a.K ? a.b : a.a.a.body));
  return a.Ea;
}
function we(a) {
  return a.j ? a.j.length : 0;
}
function te(a, b) {
  var c;
  a.G && b ? (c = a.G, c = (null !== c && b in c ? c[b] : void 0) || null) : c = null;
  return c;
}
function U(a, b) {
  return a.j ? a.j[b] || null : null;
}
function ve(a, b, c) {
  a.j && B(a.j, b, c);
}
function ze(a, b) {
  return a.j && b ? Sa(a.j, b) : -1;
}
e.removeChild = function(a, b) {
  if (a) {
    var c = p(a) ? a : a.P();
    a = te(this, c);
    if (c && a) {
      var d = this.G;
      c in d && delete d[c];
      Ya(this.j, a);
      b && (a.da(), a.b && yd(a.b));
      se(a, null);
    }
  }
  if (!a) {
    throw Error("Child is not in parent component");
  }
  return a;
};
function Ae() {
  S.call(this);
}
w(Ae, S);
e = Ae.prototype;
e.hc = null;
e.v = function() {
  ad(this.g());
  $c(this.hc);
  this.hc = null;
  Ae.m.v.call(this);
};
e.J = function() {
  var a = this.a.C("DIV", "banner");
  Od(a, "position", "absolute");
  Od(a, "top", "0");
  K(a, "click", v(this.Lb, this, !1));
  this.b = a;
  this.Mb();
  this.hc = K(qd(this.a.a) || window, "resize", this.Mb, !1, this);
};
e.Lb = function(a) {
  Q(this.g(), a);
  this.Mb();
};
e.Mb = function() {
  if (!this.g().style.display) {
    var a = qd(this.a.a) || window, b = Jd(this.a).x, c = ae(this.g()), a = Math.max(b + od(a || window).width / 2 - c.width / 2, 0);
    Td(this.g(), a, 0);
  }
};
function Be(a, b, c) {
  I.call(this, a, b);
  this.data = c;
}
w(Be, I);
var Ce;
function De(a, b) {
  b ? a.setAttribute("role", b) : a.removeAttribute("role");
}
function Ee(a, b, c) {
  ga(c) && (c = c.join(" "));
  var d = "aria-" + b;
  "" === c || void 0 == c ? (Ce || (Ce = {atomic:!1, autocomplete:"none", dropeffect:"none", haspopup:!1, live:"off", multiline:!1, multiselectable:!1, orientation:"vertical", readonly:!1, relevant:"additions text", required:!1, sort:"none", busy:!1, disabled:!1, hidden:!1, invalid:"false"}), c = Ce, b in c ? a.setAttribute(d, c[b]) : a.removeAttribute(d)) : a.setAttribute(d, c);
}
;function Fe(a) {
  if (a.classList) {
    return a.classList;
  }
  a = a.className;
  return p(a) && a.match(/\S+/g) || [];
}
function Ge(a, b) {
  return a.classList ? a.classList.contains(b) : Xa(Fe(a), b);
}
function He(a, b) {
  a.classList ? a.classList.add(b) : Ge(a, b) || (a.className += 0 < a.className.length ? " " + b : b);
}
function Ie(a, b) {
  if (a.classList) {
    B(b, function(b) {
      He(a, b);
    });
  } else {
    var c = {};
    B(Fe(a), function(a) {
      c[a] = !0;
    });
    B(b, function(a) {
      c[a] = !0;
    });
    a.className = "";
    for (var d in c) {
      a.className += 0 < a.className.length ? " " + d : d;
    }
  }
}
function Je(a, b) {
  a.classList ? a.classList.remove(b) : Ge(a, b) && (a.className = Ta(Fe(a), function(a) {
    return a != b;
  }).join(" "));
}
function Ke(a, b) {
  a.classList ? B(b, function(b) {
    Je(a, b);
  }) : a.className = Ta(Fe(a), function(a) {
    return !Xa(b, a);
  }).join(" ");
}
;function Le(a, b, c, d, f) {
  if (!(E || Sb || G && H("525"))) {
    return !0;
  }
  if (Tb && f) {
    return Me(a);
  }
  if (f && !d) {
    return !1;
  }
  "number" == typeof b && (b = Ne(b));
  if (!c && (17 == b || 18 == b || Tb && 91 == b)) {
    return !1;
  }
  if ((G || Sb) && d && c) {
    switch(a) {
      case 220:
      ;
      case 219:
      ;
      case 221:
      ;
      case 192:
      ;
      case 186:
      ;
      case 189:
      ;
      case 187:
      ;
      case 188:
      ;
      case 190:
      ;
      case 191:
      ;
      case 192:
      ;
      case 222:
        return !1;
    }
  }
  if (E && d && b == a) {
    return !1;
  }
  switch(a) {
    case 13:
      return !0;
    case 27:
      return !(G || Sb);
  }
  return Me(a);
}
function Me(a) {
  if (48 <= a && 57 >= a || 96 <= a && 106 >= a || 65 <= a && 90 >= a || (G || Sb) && 0 == a) {
    return !0;
  }
  switch(a) {
    case 32:
    ;
    case 43:
    ;
    case 63:
    ;
    case 64:
    ;
    case 107:
    ;
    case 109:
    ;
    case 110:
    ;
    case 111:
    ;
    case 186:
    ;
    case 59:
    ;
    case 189:
    ;
    case 187:
    ;
    case 61:
    ;
    case 188:
    ;
    case 190:
    ;
    case 191:
    ;
    case 192:
    ;
    case 222:
    ;
    case 219:
    ;
    case 220:
    ;
    case 221:
      return !0;
    default:
      return !1;
  }
}
function Ne(a) {
  if (F) {
    a = Oe(a);
  } else {
    if (Tb && G) {
      a: {
        switch(a) {
          case 93:
            a = 91;
            break a;
        }
      }
    }
  }
  return a;
}
function Oe(a) {
  switch(a) {
    case 61:
      return 187;
    case 59:
      return 186;
    case 173:
      return 189;
    case 224:
      return 91;
    case 0:
      return 224;
    default:
      return a;
  }
}
;function Pe(a, b, c) {
  R.call(this);
  this.target = a;
  this.G = b || a;
  this.h = c || new Md(NaN, NaN, NaN, NaN);
  this.l = O(a);
  this.a = new le(this);
  wa(this, oa(z, this.a));
  this.j = this.c = this.F = this.B = this.clientY = this.clientX = 0;
  this.o = !0;
  this.b = !1;
  K(this.G, ["touchstart", "mousedown"], this.Wc, !1, this);
}
w(Pe, R);
var Qe = m.document && m.document.documentElement && !!m.document.documentElement.setCapture;
e = Pe.prototype;
e.ja = function(a) {
  this.o = a;
};
e.v = function() {
  Pe.m.v.call(this);
  Zc(this.G, ["touchstart", "mousedown"], this.Wc, !1, this);
  ne(this.a);
  Qe && this.l.releaseCapture();
  this.G = this.target = null;
};
e.Wc = function(a) {
  var b = "mousedown" == a.type;
  if (!this.o || this.b || b && !Fc(a)) {
    this.D("earlycancel");
  } else {
    if (this.D(new Re("start", this, a.clientX, a.clientY))) {
      this.b = !0;
      a.b();
      var b = this.l, c = b.documentElement, d = !Qe;
      this.a.w(b, ["touchmove", "mousemove"], this.sd, d);
      this.a.w(b, ["touchend", "mouseup"], this.ub, d);
      Qe ? (c.setCapture(!1), this.a.w(c, "losecapture", this.ub)) : this.a.w(qd(b), "blur", this.ub);
      this.H && this.a.w(this.H, "scroll", this.Kd, d);
      this.clientX = this.B = a.clientX;
      this.clientY = this.F = a.clientY;
      this.c = this.target.offsetLeft;
      this.j = this.target.offsetTop;
      this.M = Jd(N(this.l));
    }
  }
};
e.ub = function(a) {
  ne(this.a);
  Qe && this.l.releaseCapture();
  if (this.b) {
    this.b = !1;
    var b = Se(this, this.c), c = Te(this, this.j);
    this.D(new Re("end", this, a.clientX, a.clientY, 0, b, c));
  } else {
    this.D("earlycancel");
  }
};
e.sd = function(a) {
  if (this.o) {
    var b = 1 * (a.clientX - this.clientX), c = a.clientY - this.clientY;
    this.clientX = a.clientX;
    this.clientY = a.clientY;
    if (!this.b) {
      var d = this.B - this.clientX, f = this.F - this.clientY;
      if (0 < d * d + f * f) {
        if (this.D(new Re("start", this, a.clientX, a.clientY))) {
          this.b = !0;
        } else {
          this.Ma || this.ub(a);
          return;
        }
      }
    }
    c = Ue(this, b, c);
    b = c.x;
    c = c.y;
    this.b && this.D(new Re("beforedrag", this, a.clientX, a.clientY, 0, b, c)) && (Ve(this, a, b, c), a.b());
  }
};
function Ue(a, b, c) {
  var d = Jd(N(a.l));
  b += d.x - a.M.x;
  c += d.y - a.M.y;
  a.M = d;
  a.c += b;
  a.j += c;
  b = Se(a, a.c);
  a = Te(a, a.j);
  return new L(b, a);
}
e.Kd = function(a) {
  var b = Ue(this, 0, 0);
  a.clientX = this.clientX;
  a.clientY = this.clientY;
  Ve(this, a, b.x, b.y);
};
function Ve(a, b, c, d) {
  a.target.style.left = c + "px";
  a.target.style.top = d + "px";
  a.D(new Re("drag", a, b.clientX, b.clientY, 0, c, d));
}
function Se(a, b) {
  var c = a.h, d = isNaN(c.left) ? null : c.left, c = isNaN(c.width) ? 0 : c.width;
  return Math.min(null != d ? d + c : Infinity, Math.max(null != d ? d : -Infinity, b));
}
function Te(a, b) {
  var c = a.h, d = isNaN(c.top) ? null : c.top, c = isNaN(c.height) ? 0 : c.height;
  return Math.min(null != d ? d + c : Infinity, Math.max(null != d ? d : -Infinity, b));
}
function Re(a, b, c, d, f, g, h) {
  I.call(this, a);
  this.clientX = c;
  this.clientY = d;
  this.left = n(g) ? g : b.c;
  this.top = n(h) ? h : b.j;
}
w(Re, I);
function We(a, b, c) {
  this.j = c;
  this.c = a;
  this.l = b;
  this.b = 0;
  this.a = null;
}
We.prototype.put = function(a) {
  this.l(a);
  this.b < this.j && (this.b++, a.next = this.a, this.a = a);
};
function Xe() {
  this.b = this.a = null;
}
var Ze = new We(function() {
  return new Ye;
}, function(a) {
  a.reset();
}, 100);
Xe.prototype.add = function(a, b) {
  var c;
  0 < Ze.b ? (Ze.b--, c = Ze.a, Ze.a = c.next, c.next = null) : c = Ze.c();
  c.Ra = a;
  c.scope = b;
  c.next = null;
  this.b ? this.b.next = c : this.a = c;
  this.b = c;
};
Xe.prototype.remove = function() {
  var a = null;
  this.a && (a = this.a, this.a = this.a.next, this.a || (this.b = null), a.next = null);
  return a;
};
function Ye() {
  this.next = this.scope = this.Ra = null;
}
Ye.prototype.reset = function() {
  this.next = this.scope = this.Ra = null;
};
function $e(a) {
  m.setTimeout(function() {
    throw a;
  }, 0);
}
var af;
function bf() {
  var a = m.MessageChannel;
  "undefined" === typeof a && "undefined" !== typeof window && window.postMessage && window.addEventListener && !C("Presto") && (a = function() {
    var a = document.createElement("IFRAME");
    a.style.display = "none";
    a.src = "";
    document.documentElement.appendChild(a);
    var b = a.contentWindow, a = b.document;
    a.open();
    a.write("");
    a.close();
    var c = "callImmediate" + Math.random(), d = "file:" == b.location.protocol ? "*" : b.location.protocol + "//" + b.location.host, a = v(function(a) {
      if (("*" == d || a.origin == d) && a.data == c) {
        this.port1.onmessage();
      }
    }, this);
    b.addEventListener("message", a, !1);
    this.port1 = {};
    this.port2 = {postMessage:function() {
      b.postMessage(c, d);
    }};
  });
  if ("undefined" !== typeof a && !C("Trident") && !C("MSIE")) {
    var b = new a, c = {}, d = c;
    b.port1.onmessage = function() {
      if (n(c.next)) {
        c = c.next;
        var a = c.pc;
        c.pc = null;
        a();
      }
    };
    return function(a) {
      d.next = {pc:a};
      d = d.next;
      b.port2.postMessage(0);
    };
  }
  return "undefined" !== typeof document && "onreadystatechange" in document.createElement("SCRIPT") ? function(a) {
    var b = document.createElement("SCRIPT");
    b.onreadystatechange = function() {
      b.onreadystatechange = null;
      b.parentNode.removeChild(b);
      b = null;
      a();
      a = null;
    };
    document.documentElement.appendChild(b);
  } : function(a) {
    m.setTimeout(a, 0);
  };
}
;function cf(a, b) {
  df || ef();
  ff || (df(), ff = !0);
  gf.add(a, b);
}
var df;
function ef() {
  if (m.Promise && m.Promise.resolve) {
    var a = m.Promise.resolve(void 0);
    df = function() {
      a.then(hf);
    };
  } else {
    df = function() {
      var a = hf;
      !r(m.setImmediate) || m.Window && m.Window.prototype && m.Window.prototype.setImmediate == m.setImmediate ? (af || (af = bf()), af(a)) : m.setImmediate(a);
    };
  }
}
var ff = !1, gf = new Xe;
function hf() {
  for (var a = null;a = gf.remove();) {
    try {
      a.Ra.call(a.scope);
    } catch (b) {
      $e(b);
    }
    Ze.put(a);
  }
  ff = !1;
}
;function jf(a, b, c) {
  if (r(a)) {
    c && (a = v(a, c));
  } else {
    if (a && "function" == typeof a.handleEvent) {
      a = v(a.handleEvent, a);
    } else {
      throw Error("Invalid listener argument");
    }
  }
  return 2147483647 < b ? -1 : m.setTimeout(a, b || 0);
}
;var kf = E ? 'javascript:""' : "about:blank";
function lf(a) {
  R.call(this);
  this.a = a;
  a = E ? "focusout" : "blur";
  this.b = K(this.a, E ? "focusin" : "focus", this, !E);
  this.c = K(this.a, a, this, !E);
}
w(lf, R);
lf.prototype.handleEvent = function(a) {
  var b = new J(a.c);
  b.type = "focusin" == a.type || "focus" == a.type ? "focusin" : "focusout";
  this.D(b);
};
lf.prototype.v = function() {
  lf.m.v.call(this);
  $c(this.b);
  $c(this.c);
  delete this.a;
};
function mf(a, b) {
  this.c = a;
  this.b = b;
}
;function nf(a, b) {
  R.call(this);
  this.c = new le(this);
  this.jc(a || null);
  b && (this.$a = b);
}
w(nf, R);
e = nf.prototype;
e.ea = null;
e.oc = null;
e.aa = !1;
e.fc = -1;
e.$a = "toggle_display";
e.g = function() {
  return this.ea;
};
e.jc = function(a) {
  if (this.aa) {
    throw Error("Can not change this state of the popup while showing.");
  }
  this.ea = a;
};
e.za = function(a) {
  this.H && this.H.stop();
  this.B && this.B.stop();
  if (a) {
    if (!this.aa && this.gc()) {
      if (!this.ea) {
        throw Error("Caller must call setElement before trying to show the popup");
      }
      this.hb();
      a = O(this.ea);
      this.c.w(a, "mousedown", this.Qc, !0);
      if (E) {
        var b;
        try {
          b = a.activeElement;
        } catch (c) {
        }
        for (;b && "IFRAME" == b.nodeName;) {
          try {
            var d = b.contentDocument || b.contentWindow.document;
          } catch (f) {
            break;
          }
          a = d;
          b = a.activeElement;
        }
        this.c.w(a, "mousedown", this.Qc, !0);
        this.c.w(a, "deactivate", this.Pc);
      } else {
        this.c.w(a, "blur", this.Pc);
      }
      "toggle_display" == this.$a ? (this.ea.style.visibility = "visible", Q(this.ea, !0)) : "move_offscreen" == this.$a && this.hb();
      this.aa = !0;
      this.fc = pa();
      this.H ? (Yc(this.H, "end", this.Ab, !1, this), this.H.play()) : this.Ab();
    }
  } else {
    of(this);
  }
};
e.hb = da;
function of(a, b) {
  a.aa && a.D({type:"beforehide", target:b}) && (a.c && ne(a.c), a.aa = !1, pa(), a.B ? (Yc(a.B, "end", oa(a.qc, b), !1, a), a.B.play()) : a.qc(b));
}
e.qc = function(a) {
  "toggle_display" == this.$a ? this.Ad() : "move_offscreen" == this.$a && (this.ea.style.top = "-10000px");
  this.jb(a);
};
e.Ad = function() {
  this.ea.style.visibility = "hidden";
  Q(this.ea, !1);
};
e.gc = function() {
  return this.D("beforeshow");
};
e.Ab = function() {
  this.D("show");
};
e.jb = function(a) {
  this.D({type:"hide", target:a});
};
e.Qc = function(a) {
  a = a.target;
  zd(this.ea, a) || pf(this, a) || 150 > pa() - this.fc || of(this, a);
};
e.Pc = function(a) {
  var b = O(this.ea);
  if ("undefined" != typeof document.activeElement) {
    if (a = b.activeElement, !a || zd(this.ea, a) || "BODY" == a.tagName) {
      return;
    }
  } else {
    if (a.target != b) {
      return;
    }
  }
  150 > pa() - this.fc || of(this);
};
function pf(a, b) {
  return Va(a.oc || [], function(a) {
    return b === a || zd(a, b);
  });
}
e.v = function() {
  nf.m.v.call(this);
  this.c.O();
  z(this.H);
  z(this.B);
  delete this.ea;
  delete this.c;
  delete this.oc;
};
function qf(a, b) {
  S.call(this, b);
  this.Pa = !!a;
  this.B = null;
}
w(qf, S);
e = qf.prototype;
e.Ub = null;
e.ya = !1;
e.ca = null;
e.W = null;
e.la = null;
e.Rb = !1;
e.X = function() {
  return "goog-modalpopup";
};
e.vb = function() {
  return this.ca;
};
e.J = function() {
  qf.m.J.call(this);
  var a = this.g(), b = Aa(this.X()).split(" ");
  Ie(a, b);
  Dd(a, !0);
  Q(a, !1);
  this.Pa && !this.W && (a = this.a, b = p(void 0) ? Gb(void 0).b() : "", this.W = a.C("iframe", {frameborder:0, style:"border:0;vertical-align:bottom;" + b, src:kf}), this.W.className = this.X() + "-bg", Q(this.W, !1), de(this.W, 0));
  this.ca || (this.ca = this.a.C("DIV", this.X() + "-bg"), Q(this.ca, !1));
  this.la || (this.la = this.a.a.createElement("SPAN"), Q(this.la, !1), Dd(this.la, !0), this.la.style.position = "absolute");
};
e.Tc = function() {
  this.Rb = !1;
};
e.U = function() {
  if (this.W) {
    var a = this.g();
    a.parentNode && a.parentNode.insertBefore(this.W, a);
  }
  a = this.g();
  a.parentNode && a.parentNode.insertBefore(this.ca, a);
  qf.m.U.call(this);
  a = this.g();
  a.parentNode && a.parentNode.insertBefore(this.la, a.nextSibling);
  this.Ub = new lf(this.a.a);
  T(this).w(this.Ub, "focusin", this.Gd);
  rf(this, !1);
};
e.da = function() {
  this.ya && this.Y(!1);
  z(this.Ub);
  qf.m.da.call(this);
  yd(this.W);
  yd(this.ca);
  yd(this.la);
};
e.Y = function(a) {
  if (a != this.ya) {
    if (this.H && this.H.stop(), this.T && this.T.stop(), this.F && this.F.stop(), this.L && this.L.stop(), this.K && rf(this, a), a) {
      if (this.D("beforeshow")) {
        try {
          this.B = this.a.a.activeElement;
        } catch (b) {
        }
        this.ic();
        sf(this);
        T(this).w(rd(this.a.a), "resize", this.ic);
        tf(this, !0);
        this.vc();
        this.ya = !0;
        this.H && this.T ? (Yc(this.H, "end", this.Kb, !1, this), this.T.play(), this.H.play()) : this.Kb();
      }
    } else {
      if (this.D("beforehide")) {
        T(this).ma(rd(this.a.a), "resize", this.ic);
        this.ya = !1;
        this.F && this.L ? (Yc(this.F, "end", this.Jb, !1, this), this.L.play(), this.F.play()) : this.Jb();
        a: {
          try {
            var c = this.a, d = c.a.body, f = c.a.activeElement || d;
            if (!this.B || this.B == d) {
              this.B = null;
              break a;
            }
            (f == d || c.contains(this.g(), f)) && this.B.focus();
          } catch (g) {
          }
          this.B = null;
        }
      }
    }
  }
};
function rf(a, b) {
  a.ba || (a.ba = new mf(a.b, a.a));
  var c = a.ba;
  if (b) {
    c.a || (c.a = []);
    for (var d = Kd(c.b.a.body), f = 0;f < d.length;f++) {
      var g = d[f], h;
      if (h = g != c.c) {
        h = g.getAttribute("aria-hidden"), h = !(null == h || void 0 == h ? 0 : String(h));
      }
      h && (Ee(g, "hidden", !0), c.a.push(g));
    }
  } else {
    if (c.a) {
      for (f = 0;f < c.a.length;f++) {
        c.a[f].removeAttribute("aria-hidden");
      }
      c.a = null;
    }
  }
}
function tf(a, b) {
  a.W && Q(a.W, b);
  a.ca && Q(a.ca, b);
  Q(a.g(), b);
  Q(a.la, b);
}
e.Kb = function() {
  this.D("show");
};
e.Jb = function() {
  tf(this, !1);
  this.D("hide");
};
e.ic = function() {
  this.W && Q(this.W, !1);
  this.ca && Q(this.ca, !1);
  var a = this.a.a, b = od(qd(a) || window || window), c = Math.max(b.width, Math.max(a.body.scrollWidth, a.documentElement.scrollWidth)), a = Math.max(b.height, Math.max(a.body.scrollHeight, a.documentElement.scrollHeight));
  this.W && (Q(this.W, !0), $d(this.W, c, a));
  this.ca && (Q(this.ca, !0), $d(this.ca, c, a));
};
function sf(a) {
  var b = qd(a.a.a) || window;
  if ("fixed" == Sd(a.g(), "position")) {
    var c = 0, d = 0
  } else {
    d = Jd(a.a), c = d.x, d = d.y;
  }
  var f = ae(a.g()), b = od(b || window), c = Math.max(c + b.width / 2 - f.width / 2, 0), d = Math.max(d + b.height / 2 - f.height / 2, 0);
  Td(a.g(), c, d);
  Td(a.la, c, d);
}
e.Gd = function(a) {
  this.Rb ? this.Tc() : a.target == this.la && jf(this.vc, 0, this);
};
e.vc = function() {
  try {
    E && this.a.a.body.focus(), this.g().focus();
  } catch (a) {
  }
};
e.v = function() {
  z(this.H);
  this.H = null;
  z(this.F);
  this.F = null;
  z(this.T);
  this.T = null;
  z(this.L);
  this.L = null;
  qf.m.v.call(this);
};
function V(a, b, c) {
  qf.call(this, b, c);
  this.o = a || "modal-dialog";
  this.c = W(W(new uf, vf, !0), wf, !1, !0);
}
w(V, qf);
e = V.prototype;
e.Oc = !0;
e.Qb = .5;
e.Yc = "";
e.$b = null;
e.va = null;
e.Za = null;
e.La = null;
e.Xc = null;
e.ta = null;
e.bb = null;
e.na = null;
e.X = function() {
  return this.o;
};
function xf(a, b) {
  a.Yc = b;
  a.La && Ad(a.La, b);
}
function yf(a, b) {
  a.$b = b;
  a.bb && (a.bb.innerHTML = Jb(b));
}
e.Ha = function() {
  this.g() || ue(this, void 0);
  return this.bb;
};
e.vb = function() {
  this.g() || ue(this, void 0);
  return V.m.vb.call(this);
};
function zf(a, b) {
  var c = Aa(a.o + "-title-draggable").split(" ");
  a.g() && (b ? Ie(a.Za, c) : Ke(a.Za, c));
  b && !a.va ? (a.va = new Pe(a.g(), a.Za), Ie(a.Za, c), K(a.va, "start", a.Sd, !1, a)) : !b && a.va && (a.va.O(), a.va = null);
}
e.J = function() {
  V.m.J.call(this);
  var a = this.g(), b = this.a;
  this.Za = b.C("DIV", this.o + "-title", this.La = b.C("SPAN", {className:this.o + "-title-text", id:this.P()}, this.Yc), this.ta = b.C("SPAN", this.o + "-title-close"));
  wd(a, this.Za, this.bb = b.C("DIV", this.o + "-content"), this.na = b.C("DIV", this.o + "-buttons"));
  De(this.La, "heading");
  De(this.ta, "button");
  Dd(this.ta, !0);
  Ee(this.ta, "label", Af);
  this.Xc = this.La.id;
  De(a, "dialog");
  Ee(a, "labelledby", this.Xc || "");
  this.$b && (this.bb.innerHTML = Jb(this.$b));
  Q(this.ta, !0);
  this.c && (a = this.c, a.xa = this.na, Bf(a));
  Q(this.na, !!this.c);
  this.Qb = this.Qb;
  this.g() && (a = this.vb()) && de(a, this.Qb);
};
e.U = function() {
  V.m.U.call(this);
  T(this).w(this.g(), "keydown", this.Rc).w(this.g(), "keypress", this.Rc);
  T(this).w(this.na, "click", this.Cd);
  zf(this, !0);
  T(this).w(this.ta, "click", this.Md);
  var a = this.g();
  De(a, "dialog");
  "" !== this.La.id && Ee(a, "labelledby", this.La.id);
  if (!this.Oc) {
    this.Oc = !1;
    if (this.K) {
      var a = this.a, b = this.vb();
      a.wc(this.W);
      a.wc(b);
    }
    this.ya && rf(this, !1);
  }
};
e.da = function() {
  this.ya && this.Y(!1);
  zf(this, !1);
  V.m.da.call(this);
};
e.Y = function(a) {
  a != this.ya && (this.K || ue(this, void 0), V.m.Y.call(this, a));
};
e.Kb = function() {
  V.m.Kb.call(this);
  this.D(Cf);
};
e.Jb = function() {
  V.m.Jb.call(this);
  this.D(Df);
};
e.Sd = function() {
  var a = this.a.a, b = od(qd(a) || window || window), c = Math.max(a.body.scrollWidth, b.width), a = Math.max(a.body.scrollHeight, b.height), d = ae(this.g());
  "fixed" == Sd(this.g(), "position") ? (b = new Md(0, 0, Math.max(0, b.width - d.width), Math.max(0, b.height - d.height)), this.va.h = b || new Md(NaN, NaN, NaN, NaN)) : this.va.h = new Md(0, 0, c - d.width, a - d.height) || new Md(NaN, NaN, NaN, NaN);
};
e.Md = function() {
  Ef(this);
};
function Ef(a) {
  var b = a.c, c = b && b.Sb;
  c ? a.D(new Ff(c, mb(b, c))) && a.Y(!1) : a.Y(!1);
}
e.v = function() {
  this.na = this.ta = null;
  V.m.v.call(this);
};
e.Cd = function(a) {
  a: {
    for (a = a.target;null != a && a != this.na;) {
      if ("BUTTON" == a.tagName) {
        break a;
      }
      a = a.parentNode;
    }
    a = null;
  }
  a && !a.disabled && (a = a.name, this.D(new Ff(a, mb(this.c, a))) && this.Y(!1));
};
e.Rc = function(a) {
  var b = !1, c = !1, d = this.c, f = a.target;
  if ("keydown" == a.type) {
    if (27 == a.a) {
      var g = d && d.Sb, f = "SELECT" == f.tagName && !f.disabled;
      g && !f ? (c = !0, b = this.D(new Ff(g, mb(d, g)))) : f || (b = !0);
    } else {
      if (9 == a.a && a.shiftKey && f == this.g()) {
        this.Rb = !0;
        try {
          this.la.focus();
        } catch (h) {
        }
        jf(this.Tc, 0, this);
      }
    }
  } else {
    if (13 == a.a) {
      if ("BUTTON" == f.tagName && !f.disabled) {
        g = f.name;
      } else {
        if (f == this.ta) {
          Ef(this);
        } else {
          if (d) {
            var k = d.Tb, l;
            if (l = k) {
              a: {
                l = d.xa.getElementsByTagName("BUTTON");
                for (var q = 0, t;t = l[q];q++) {
                  if (t.name == k || t.id == k) {
                    l = t;
                    break a;
                  }
                }
                l = null;
              }
            }
            f = ("TEXTAREA" == f.tagName || "SELECT" == f.tagName || "A" == f.tagName) && !f.disabled;
            !l || l.disabled || f || (g = k);
          }
        }
      }
      g && d && (c = !0, b = this.D(new Ff(g, String(mb(d, g)))));
    } else {
      f == this.ta && 32 == a.a && Ef(this);
    }
  }
  if (b || c) {
    a.o(), a.b();
  }
  b && this.Y(!1);
};
function Ff(a, b) {
  this.type = Gf;
  this.key = a;
  this.caption = b;
}
w(Ff, I);
var Gf = "dialogselect", Df = "afterhide", Cf = "aftershow";
function uf(a) {
  a || N();
  jb.call(this);
}
w(uf, jb);
e = uf.prototype;
e.Tb = null;
e.xa = null;
e.Sb = null;
e.ra = function(a, b, c, d) {
  jb.prototype.ra.call(this, a, b);
  c && (this.Tb = a);
  d && (this.Sb = a);
  return this;
};
function W(a, b, c, d) {
  return a.ra(b.key, b.caption, c, d);
}
function Bf(a) {
  if (a.xa) {
    a.xa.innerHTML = Jb(Lb);
    var b = N(a.xa);
    a.forEach(function(a, d) {
      var f = b.C("BUTTON", {name:d}, a);
      d == this.Tb && (f.className = "goog-buttonset-default");
      this.xa.appendChild(f);
    }, a);
  }
}
e.g = function() {
  return this.xa;
};
var Af = "Close", vf = {key:"ok", caption:"OK"}, wf = {key:"cancel", caption:"Cancel"}, Hf = {key:"yes", caption:"Yes"}, If = {key:"no", caption:"No"}, Jf = {key:"save", caption:"Save"}, Kf = {key:"continue", caption:"Continue"};
"undefined" != typeof document && (W(new uf, vf, !0, !0), W(W(new uf, vf, !0), wf, !1, !0), W(W(new uf, Hf, !0), If, !1, !0), W(W(W(new uf, Hf), If, !0), wf, !1, !0), W(W(W(new uf, Kf), Jf), wf, !0, !0));
function Lf() {
  V.call(this, void 0, !0);
  this.c = W(new uf, vf, !0, !0);
  if (this.na) {
    if (this.c) {
      var a = this.c;
      a.xa = this.na;
      Bf(a);
    } else {
      this.na.innerHTML = Jb(Lb);
    }
    Q(this.na, !!this.c);
  }
  Mf(this, Nf);
}
w(Lf, V);
var Nf = 0;
Lf.prototype.A = Nf;
Lf.prototype.v = function() {
  delete this.A;
  Lf.m.v.call(this);
};
function Mf(a, b) {
  a.A = b;
  switch(b) {
    case 1:
      xf(a, "Screenshot");
      break;
    default:
      xf(a, "Taking Screenshot..."), yf(a, Kb("", null));
  }
}
;function Of() {
  S.call(this);
}
w(Of, S);
Of.prototype.J = function() {
  this.b = this.a.C("DIV", "server-info");
  Pf(this);
};
function Pf(a, b, c, d) {
  var f = [];
  b && f.push(b);
  c && f.push("v" + c);
  d && f.push("r" + d);
  Ad(a.g(), f.length ? f.join("\u00a0\u00a0|\u00a0\u00a0") : "Server info unavailable");
}
;function Qf(a, b) {
  R.call(this);
  a && Rf(this, a, b);
}
w(Qf, R);
e = Qf.prototype;
e.Ta = null;
e.Hb = null;
e.dc = null;
e.Ib = null;
e.ia = -1;
e.Aa = -1;
e.Ob = !1;
var Sf = {3:13, 12:144, 63232:38, 63233:40, 63234:37, 63235:39, 63236:112, 63237:113, 63238:114, 63239:115, 63240:116, 63241:117, 63242:118, 63243:119, 63244:120, 63245:121, 63246:122, 63247:123, 63248:44, 63272:46, 63273:36, 63275:35, 63276:33, 63277:34, 63289:144, 63302:45}, Tf = {Up:38, Down:40, Left:37, Right:39, Enter:13, F1:112, F2:113, F3:114, F4:115, F5:116, F6:117, F7:118, F8:119, F9:120, F10:121, F11:122, F12:123, "U+007F":46, Home:36, End:35, PageUp:33, PageDown:34, Insert:45}, Uf = E || 
Sb || G && H("525"), Vf = Tb && F;
e = Qf.prototype;
e.qd = function(a) {
  if (G || Sb) {
    if (17 == this.ia && !a.ctrlKey || 18 == this.ia && !a.altKey || Tb && 91 == this.ia && !a.metaKey) {
      this.Aa = this.ia = -1;
    }
  }
  -1 == this.ia && (a.ctrlKey && 17 != a.a ? this.ia = 17 : a.altKey && 18 != a.a ? this.ia = 18 : a.metaKey && 91 != a.a && (this.ia = 91));
  Uf && !Le(a.a, this.ia, a.shiftKey, a.ctrlKey, a.altKey) ? this.handleEvent(a) : (this.Aa = Ne(a.a), Vf && (this.Ob = a.altKey));
};
e.rd = function(a) {
  this.Aa = this.ia = -1;
  this.Ob = a.altKey;
};
e.handleEvent = function(a) {
  var b = a.c, c, d, f = b.altKey;
  E && "keypress" == a.type ? c = this.Aa : (G || Sb) && "keypress" == a.type ? c = this.Aa : Rb && !G ? c = this.Aa : (c = b.keyCode || this.Aa, d = b.charCode || 0, Vf && (f = this.Ob), Tb && 63 == d && 224 == c && (c = 191));
  d = c = Ne(c);
  var g = b.keyIdentifier;
  c ? 63232 <= c && c in Sf ? d = Sf[c] : 25 == c && a.shiftKey && (d = 9) : g && g in Tf && (d = Tf[g]);
  this.ia = d;
  a = new Wf(d, 0, 0, b);
  a.altKey = f;
  this.D(a);
};
e.g = function() {
  return this.Ta;
};
function Rf(a, b, c) {
  a.Ib && Xf(a);
  a.Ta = b;
  a.Hb = K(a.Ta, "keypress", a, c);
  a.dc = K(a.Ta, "keydown", a.qd, c, a);
  a.Ib = K(a.Ta, "keyup", a.rd, c, a);
}
function Xf(a) {
  a.Hb && ($c(a.Hb), $c(a.dc), $c(a.Ib), a.Hb = null, a.dc = null, a.Ib = null);
  a.Ta = null;
  a.ia = -1;
  a.Aa = -1;
}
e.v = function() {
  Qf.m.v.call(this);
  Xf(this);
};
function Wf(a, b, c, d) {
  J.call(this, d);
  this.type = "key";
  this.a = a;
}
w(Wf, J);
function Yf() {
}
var Zf;
ea(Yf);
var $f = {button:"pressed", checkbox:"checked", menuitem:"selected", menuitemcheckbox:"checked", menuitemradio:"checked", radio:"checked", tab:"selected", treeitem:"selected"};
e = Yf.prototype;
e.xb = function() {
};
e.Va = function(a) {
  return a.a.C("DIV", ag(this, a).join(" "), a.Ia);
};
function bg(a, b, c) {
  if (a = a.g ? a.g() : a) {
    var d = [b];
    E && !H("7") && (d = cg(Fe(a), b), d.push(b));
    (c ? Ie : Ke)(a, d);
  }
}
e.zc = function(a) {
  xe(a) && this.Cc(a.g(), !0);
  a.isEnabled() && this.yb(a, !0);
};
e.Bc = function(a, b) {
  ge(a, !b, !E && !Rb);
};
e.Cc = function(a, b) {
  bg(a, this.X() + "-rtl", b);
};
e.Ac = function(a) {
  var b;
  return a.V & 32 && (b = a.g()) ? Ed(b) && Fd(b) : !1;
};
e.yb = function(a, b) {
  var c;
  if (a.V & 32 && (c = a.g())) {
    if (!b && a.A & 32) {
      try {
        c.blur();
      } catch (d) {
      }
      a.A & 32 && a.Dc();
    }
    (Ed(c) && Fd(c)) != b && Dd(c, b);
  }
};
e.Xb = function(a, b, c) {
  var d = a.g();
  if (d) {
    var f = dg(this, b);
    f && bg(a, f, c);
    this.ua(d, b, c);
  }
};
e.ua = function(a, b, c) {
  Zf || (Zf = {1:"disabled", 8:"selected", 16:"checked", 64:"expanded"});
  b = Zf[b];
  var d = a.getAttribute("role") || null;
  d && (d = $f[d] || b, b = "checked" == b || "selected" == b ? d : b);
  b && Ee(a, b, c);
};
function eg(a, b) {
  if (a && (xd(a), b)) {
    if (p(b)) {
      Ad(a, b);
    } else {
      var c = function(b) {
        if (b) {
          var c = O(a);
          a.appendChild(p(b) ? c.createTextNode(b) : b);
        }
      };
      ga(b) ? B(b, c) : !ha(b) || "nodeType" in b ? c(b) : B($a(b), c);
    }
  }
}
e.X = function() {
  return "goog-control";
};
function ag(a, b) {
  var c = a.X(), d = [c], f = a.X();
  f != c && d.push(f);
  c = b.A;
  for (f = [];c;) {
    var g = c & -c;
    f.push(dg(a, g));
    c &= ~g;
  }
  d.push.apply(d, f);
  (c = b.uc) && d.push.apply(d, c);
  E && !H("7") && d.push.apply(d, cg(d));
  return d;
}
function cg(a, b) {
  var c = [];
  b && (a = a.concat([b]));
  B([], function(d) {
    !Wa(d, oa(Xa, a)) || b && !Xa(d, b) || c.push(d.join("_"));
  });
  return c;
}
function dg(a, b) {
  if (!a.a) {
    var c = a.X();
    c.replace(/\xa0|\s/g, " ");
    a.a = {1:c + "-disabled", 2:c + "-hover", 4:c + "-active", 8:c + "-selected", 16:c + "-checked", 32:c + "-focused", 64:c + "-open"};
  }
  return a.a[b];
}
;function fg(a, b) {
  if (!a) {
    throw Error("Invalid class name " + a);
  }
  if (!r(b)) {
    throw Error("Invalid decorator function " + b);
  }
}
var gg = {};
function X(a, b, c) {
  S.call(this, c);
  if (!b) {
    b = this.constructor;
    for (var d;b;) {
      d = u(b);
      if (d = gg[d]) {
        break;
      }
      b = b.m ? b.m.constructor : null;
    }
    b = d ? r(d.Ga) ? d.Ga() : new d : null;
  }
  this.c = b;
  this.Ia = n(a) ? a : null;
}
w(X, S);
e = X.prototype;
e.Ia = null;
e.A = 0;
e.V = 39;
e.Pb = 255;
e.Ka = 0;
e.uc = null;
e.ac = !0;
function hg(a, b) {
  a.K && b != a.ac && ig(a, b);
  a.ac = b;
}
e.J = function() {
  var a = this.c.Va(this);
  this.b = a;
  var b = this.c.xb();
  if (b) {
    var c = a.getAttribute("role") || null;
    b != c && De(a, b);
  }
  this.c.Bc(a, !1);
};
e.Ha = function() {
  return this.g();
};
e.U = function() {
  X.m.U.call(this);
  var a = this.c, b = this.b;
  this.isEnabled() || a.ua(b, 1, !this.isEnabled());
  this.V & 8 && a.ua(b, 8, !!(this.A & 8));
  this.V & 16 && a.ua(b, 16, !!(this.A & 16));
  this.V & 64 && a.ua(b, 64, !!(this.A & 64));
  this.c.zc(this);
  this.V & -2 && (this.ac && ig(this, !0), this.V & 32 && (a = this.g())) && (b = this.h || (this.h = new Qf), Rf(b, a), T(this).w(b, "key", this.gb).w(a, "focus", this.fd).w(a, "blur", this.Dc));
};
function ig(a, b) {
  var c = T(a), d = a.g();
  b ? (c.w(d, "mouseover", a.Zb).w(d, "mousedown", a.zb).w(d, "mouseup", a.Cb).w(d, "mouseout", a.bc), a.ib != da && c.w(d, "contextmenu", a.ib), E && (c.w(d, "dblclick", a.Gc), a.B || (a.B = new jg(a), wa(a, oa(z, a.B))))) : (c.ma(d, "mouseover", a.Zb).ma(d, "mousedown", a.zb).ma(d, "mouseup", a.Cb).ma(d, "mouseout", a.bc), a.ib != da && c.ma(d, "contextmenu", a.ib), E && (c.ma(d, "dblclick", a.Gc), z(a.B), a.B = null));
}
e.da = function() {
  X.m.da.call(this);
  this.h && Xf(this.h);
  this.isEnabled() && this.c.yb(this, !1);
};
e.v = function() {
  X.m.v.call(this);
  this.h && (this.h.O(), delete this.h);
  delete this.c;
  this.B = this.uc = this.Ia = null;
};
function kg(a) {
  a = a.Ia;
  if (!a) {
    return "";
  }
  if (!p(a)) {
    if (ga(a)) {
      a = Ua(a, Gd).join("");
    } else {
      if (id && "innerText" in a) {
        a = a.innerText.replace(/(\r\n|\r|\n)/g, "\n");
      } else {
        var b = [];
        Hd(a, b, !0);
        a = b.join("");
      }
      a = a.replace(/ \xAD /g, " ").replace(/\xAD/g, "");
      a = a.replace(/\u200B/g, "");
      id || (a = a.replace(/ +/g, " "));
      " " != a && (a = a.replace(/^\s*/, ""));
    }
  }
  return a.replace(/[\t\r\n ]+/g, " ").replace(/^[\t\r\n ]+|[\t\r\n ]+$/g, "");
}
e.isEnabled = function() {
  return !(this.A & 1);
};
e.ja = function(a) {
  var b = this.l;
  b && "function" == typeof b.isEnabled && !b.isEnabled() || !lg(this, 1, !a) || (a || (mg(this, !1), ng(this, !1)), this.c.yb(this, a), og(this, 1, !a, !0));
};
function ng(a, b) {
  lg(a, 2, b) && og(a, 2, b);
}
function mg(a, b) {
  lg(a, 4, b) && og(a, 4, b);
}
function pg(a, b) {
  lg(a, 8, b) && og(a, 8, b);
}
function qg(a, b) {
  lg(a, 64, b) && og(a, 64, b);
}
function og(a, b, c, d) {
  d || 1 != b ? a.V & b && c != !!(a.A & b) && (a.c.Xb(a, b, c), a.A = c ? a.A | b : a.A & ~b) : a.ja(!c);
}
function rg(a, b, c) {
  if (a.K && a.A & b && !c) {
    throw Error("Component already rendered");
  }
  !c && a.A & b && og(a, b, !1);
  a.V = c ? a.V | b : a.V & ~b;
}
function Y(a, b) {
  return !!(a.Pb & b) && !!(a.V & b);
}
function lg(a, b, c) {
  return !!(a.V & b) && !!(a.A & b) != c && (!(a.Ka & b) || a.D(re(b, c))) && !a.Ma;
}
e.Zb = function(a) {
  (!a.j || !zd(this.g(), a.j)) && this.D("enter") && this.isEnabled() && Y(this, 2) && ng(this, !0);
};
e.bc = function(a) {
  a.j && zd(this.g(), a.j) || !this.D("leave") || (Y(this, 4) && mg(this, !1), Y(this, 2) && ng(this, !1));
};
e.ib = da;
e.zb = function(a) {
  this.isEnabled() && (Y(this, 2) && ng(this, !0), Fc(a) && (Y(this, 4) && mg(this, !0), this.c && this.c.Ac(this) && this.g().focus()));
  Fc(a) && a.b();
};
e.Cb = function(a) {
  this.isEnabled() && (Y(this, 2) && ng(this, !0), this.A & 4 && this.kb(a) && Y(this, 4) && mg(this, !1));
};
e.Gc = function(a) {
  this.isEnabled() && this.kb(a);
};
e.kb = function(a) {
  if (Y(this, 16)) {
    var b = !(this.A & 16);
    lg(this, 16, b) && og(this, 16, b);
  }
  Y(this, 8) && pg(this, !0);
  Y(this, 64) && qg(this, !(this.A & 64));
  b = new I("action", this);
  a && (b.altKey = a.altKey, b.ctrlKey = a.ctrlKey, b.metaKey = a.metaKey, b.shiftKey = a.shiftKey, b.G = a.G);
  return this.D(b);
};
e.fd = function() {
  Y(this, 32) && lg(this, 32, !0) && og(this, 32, !0);
};
e.Dc = function() {
  Y(this, 4) && mg(this, !1);
  Y(this, 32) && lg(this, 32, !1) && og(this, 32, !1);
};
e.gb = function(a) {
  return this.isEnabled() && this.Yb(a) ? (a.b(), a.o(), !0) : !1;
};
e.Yb = function(a) {
  return 13 == a.a && this.kb(a);
};
if (!r(X)) {
  throw Error("Invalid component class " + X);
}
if (!r(Yf)) {
  throw Error("Invalid renderer class " + Yf);
}
var sg = u(X);
gg[sg] = Yf;
fg("goog-control", function() {
  return new X(null);
});
function jg(a) {
  ta.call(this);
  this.b = a;
  this.a = !1;
  this.c = new le(this);
  wa(this, oa(z, this.c));
  a = this.b.b;
  this.c.w(a, "mousedown", this.l).w(a, "mouseup", this.h).w(a, "click", this.j);
}
w(jg, ta);
jg.prototype.l = function() {
  this.a = !1;
};
jg.prototype.h = function() {
  this.a = !0;
};
jg.prototype.j = function(a) {
  if (this.a) {
    this.a = !1;
  } else {
    var b = a.c, c = b.button, d = b.type;
    b.button = 0;
    b.type = "mousedown";
    this.b.zb(new J(b, a.l));
    b.type = "mouseup";
    this.b.Cb(new J(b, a.l));
    b.button = c;
    b.type = d;
  }
};
jg.prototype.v = function() {
  this.b = null;
  jg.m.v.call(this);
};
function tg() {
}
w(tg, Yf);
ea(tg);
e = tg.prototype;
e.X = function() {
  return "goog-tab";
};
e.xb = function() {
  return "tab";
};
e.Va = function(a) {
  var b = tg.m.Va.call(this, a);
  (a = a.Sa()) && this.sa(b, a);
  return b;
};
e.Sa = function(a) {
  return a.title || "";
};
e.sa = function(a, b) {
  a && (a.title = b || "");
};
function ug(a, b, c) {
  X.call(this, a, b || tg.Ga(), c);
  rg(this, 8, !0);
  this.Ka |= 9;
}
w(ug, X);
ug.prototype.Sa = function() {
  return this.o;
};
ug.prototype.sa = function(a) {
  this.c.sa(this.g(), a);
  this.Vc(a);
};
ug.prototype.Vc = function(a) {
  this.o = a;
};
fg("goog-tab", function() {
  return new ug(null);
});
function vg(a) {
  this.b = a;
}
ea(vg);
function wg(a, b) {
  a && (a.tabIndex = b ? 0 : -1);
}
function xg(a, b) {
  var c = b.g();
  ge(c, !0, F);
  E && (c.hideFocus = !0);
  var d = a.b;
  d && De(c, d);
}
vg.prototype.X = function() {
  return "goog-container";
};
vg.prototype.a = function(a) {
  var b = this.X(), c = [b, a.Ba == yg ? b + "-horizontal" : b + "-vertical"];
  a.isEnabled() || c.push(b + "-disabled");
  return c;
};
function zg(a, b, c) {
  S.call(this, c);
  this.wb = b || vg.Ga();
  this.Ba = a || Ag;
}
w(zg, S);
var yg = "horizontal", Ag = "vertical";
e = zg.prototype;
e.ec = null;
e.eb = null;
e.wb = null;
e.Ba = null;
e.fb = !0;
e.Ua = !0;
e.I = -1;
e.R = null;
e.Xa = !1;
e.pa = null;
function Bg(a) {
  return a.ec || a.g();
}
e.J = function() {
  this.b = this.a.C("DIV", this.wb.a(this).join(" "));
};
e.Ha = function() {
  return this.g();
};
e.U = function() {
  zg.m.U.call(this);
  ve(this, function(a) {
    a.K && Cg(this, a);
  }, this);
  var a = this.g();
  xg(this.wb, this);
  Dg(this, this.fb);
  T(this).w(this, "enter", this.md).w(this, "highlight", this.pd).w(this, "unhighlight", this.yd).w(this, "open", this.td).w(this, "close", this.kd).w(a, "mousedown", this.ed).w(O(a), "mouseup", this.ld).w(a, ["mousedown", "mouseup", "mouseover", "mouseout", "contextmenu"], this.jd);
  Eg(this);
};
function Eg(a) {
  var b = T(a), c = Bg(a);
  b.w(c, "focus", a.yc).w(c, "blur", a.cd).w(a.eb || (a.eb = new Qf(Bg(a))), "key", a.dd);
}
e.da = function() {
  Fg(this, -1);
  this.R && qg(this.R, !1);
  this.Xa = !1;
  zg.m.da.call(this);
};
e.v = function() {
  zg.m.v.call(this);
  this.eb && (this.eb.O(), this.eb = null);
  this.wb = this.R = this.pa = this.ec = null;
};
e.md = function() {
  return !0;
};
e.pd = function(a) {
  var b = ze(this, a.target);
  if (-1 < b && b != this.I) {
    var c = U(this, this.I);
    c && ng(c, !1);
    this.I = b;
    c = U(this, this.I);
    this.Xa && mg(c, !0);
    this.R && c != this.R && (c.V & 64 ? qg(c, !0) : qg(this.R, !1));
  }
  b = this.g();
  null != a.target.g() && Ee(b, "activedescendant", a.target.g().id);
};
e.yd = function(a) {
  a.target == U(this, this.I) && (this.I = -1);
  this.g().removeAttribute("aria-activedescendant");
};
e.td = function(a) {
  (a = a.target) && a != this.R && a.l == this && (this.R && qg(this.R, !1), this.R = a);
};
e.kd = function(a) {
  a.target == this.R && (this.R = null);
  var b = this.g(), c = a.target.g();
  b && a.target.A & 2 && c && (a = "", c && (a = c.id), Ee(b, "activedescendant", a));
};
e.ed = function(a) {
  this.Ua && (this.Xa = !0);
  var b = Bg(this);
  b && Ed(b) && Fd(b) ? b.focus() : a.b();
};
e.ld = function() {
  this.Xa = !1;
};
e.jd = function(a) {
  var b;
  a: {
    b = a.target;
    if (this.pa) {
      for (var c = this.g();b && b !== c;) {
        var d = b.id;
        if (d in this.pa) {
          b = this.pa[d];
          break a;
        }
        b = b.parentNode;
      }
    }
    b = null;
  }
  if (b) {
    switch(a.type) {
      case "mousedown":
        b.zb(a);
        break;
      case "mouseup":
        b.Cb(a);
        break;
      case "mouseover":
        b.Zb(a);
        break;
      case "mouseout":
        b.bc(a);
        break;
      case "contextmenu":
        b.ib(a);
    }
  }
};
e.yc = function() {
};
e.cd = function() {
  Fg(this, -1);
  this.Xa = !1;
  this.R && qg(this.R, !1);
};
e.dd = function(a) {
  return this.isEnabled() && this.fb && (0 != we(this) || this.ec) && Gg(this, a) ? (a.b(), a.o(), !0) : !1;
};
function Gg(a, b) {
  var c = U(a, a.I);
  if (c && "function" == typeof c.gb && c.gb(b) || a.R && a.R != c && "function" == typeof a.R.gb && a.R.gb(b)) {
    return !0;
  }
  if (b.shiftKey || b.ctrlKey || b.metaKey || b.altKey) {
    return !1;
  }
  switch(b.a) {
    case 27:
      Bg(a).blur();
      break;
    case 36:
      Hg(a);
      break;
    case 35:
      Ig(a);
      break;
    case 38:
      if (a.Ba == Ag) {
        Jg(a);
      } else {
        return !1;
      }
      break;
    case 37:
      if (a.Ba == yg) {
        xe(a) ? Kg(a) : Jg(a);
      } else {
        return !1;
      }
      break;
    case 40:
      if (a.Ba == Ag) {
        Kg(a);
      } else {
        return !1;
      }
      break;
    case 39:
      if (a.Ba == yg) {
        xe(a) ? Jg(a) : Kg(a);
      } else {
        return !1;
      }
      break;
    default:
      return !1;
  }
  return !0;
}
function Cg(a, b) {
  var c = b.g(), c = c.id || (c.id = b.P());
  a.pa || (a.pa = {});
  a.pa[c] = b;
}
e.ka = function(a, b) {
  zg.m.ka.call(this, a, b);
};
e.rb = function(a, b, c) {
  a.Ka |= 2;
  a.Ka |= 64;
  rg(a, 32, !1);
  hg(a, !1);
  var d = a.l == this ? ze(this, a) : -1;
  zg.m.rb.call(this, a, b, c);
  a.K && this.K && Cg(this, a);
  a = d;
  -1 == a && (a = we(this));
  a == this.I ? this.I = Math.min(we(this) - 1, b) : a > this.I && b <= this.I ? this.I++ : a < this.I && b > this.I && this.I--;
};
e.removeChild = function(a, b) {
  if (a = p(a) ? te(this, a) : a) {
    var c = ze(this, a);
    -1 != c && (c == this.I ? (ng(a, !1), this.I = -1) : c < this.I && this.I--);
    var d = a.g();
    d && d.id && this.pa && (c = this.pa, d = d.id, d in c && delete c[d]);
  }
  a = zg.m.removeChild.call(this, a, b);
  hg(a, !0);
  return a;
};
function Dg(a, b) {
  a.fb = b;
  var c = a.g();
  c && (Q(c, b), wg(Bg(a), a.Ua && a.fb));
}
e.isEnabled = function() {
  return this.Ua;
};
e.ja = function(a) {
  this.Ua != a && this.D(a ? "enable" : "disable") && (a ? (this.Ua = !0, ve(this, function(a) {
    a.Zc ? delete a.Zc : a.ja(!0);
  })) : (ve(this, function(a) {
    a.isEnabled() ? a.ja(!1) : a.Zc = !0;
  }), this.Xa = this.Ua = !1), wg(Bg(this), a && this.fb));
};
function Fg(a, b) {
  var c = U(a, b);
  c ? ng(c, !0) : -1 < a.I && ng(U(a, a.I), !1);
}
function Hg(a) {
  Lg(a, function(a, c) {
    return (a + 1) % c;
  }, we(a) - 1);
}
function Ig(a) {
  Lg(a, function(a, c) {
    a--;
    return 0 > a ? c - 1 : a;
  }, 0);
}
function Kg(a) {
  Lg(a, function(a, c) {
    return (a + 1) % c;
  }, a.I);
}
function Jg(a) {
  Lg(a, function(a, c) {
    a--;
    return 0 > a ? c - 1 : a;
  }, a.I);
}
function Lg(a, b, c) {
  c = 0 > c ? ze(a, a.R) : c;
  var d = we(a);
  c = b.call(a, c, d);
  for (var f = 0;f <= d;) {
    var g = U(a, c);
    if (g && g.isEnabled() && g.V & 2) {
      a.kc(c);
      break;
    }
    f++;
    c = b.call(a, c, d);
  }
}
e.kc = function(a) {
  Fg(this, a);
};
function Mg() {
  this.b = "tablist";
}
w(Mg, vg);
ea(Mg);
Mg.prototype.X = function() {
  return "goog-tab-bar";
};
Mg.prototype.a = function(a) {
  var b = Mg.m.a.call(this, a);
  if (!this.c) {
    var c = this.X();
    this.c = hb(Ng, c + "-top", Og, c + "-bottom", Pg, c + "-start", Qg, c + "-end");
  }
  b.push(this.c[a.c]);
  return b;
};
function Rg(a, b, c) {
  a = a || Ng;
  if (this.g()) {
    throw Error("Component already rendered");
  }
  this.Ba = a == Pg || a == Qg ? Ag : yg;
  this.c = a;
  zg.call(this, this.Ba, b || Mg.Ga(), c);
  Sg(this);
}
w(Rg, zg);
var Ng = "top", Og = "bottom", Pg = "start", Qg = "end";
e = Rg.prototype;
e.$ = null;
e.U = function() {
  Rg.m.U.call(this);
  Sg(this);
};
e.v = function() {
  Rg.m.v.call(this);
  this.$ = null;
};
e.removeChild = function(a, b) {
  Tg(this, a);
  return Rg.m.removeChild.call(this, a, b);
};
e.kc = function(a) {
  Rg.m.kc.call(this, a);
  Ug(this, U(this, a));
};
function Ug(a, b) {
  b ? pg(b, !0) : a.$ && pg(a.$, !1);
}
function Tg(a, b) {
  if (b && b == a.$) {
    for (var c = ze(a, b), d = c - 1;b = U(a, d);d--) {
      if (b.isEnabled()) {
        Ug(a, b);
        return;
      }
    }
    for (c += 1;b = U(a, c);c++) {
      if (b.isEnabled()) {
        Ug(a, b);
        return;
      }
    }
    Ug(a, null);
  }
}
e.wd = function(a) {
  this.$ && this.$ != a.target && pg(this.$, !1);
  this.$ = a.target;
};
e.xd = function(a) {
  a.target == this.$ && (this.$ = null);
};
e.ud = function(a) {
  Tg(this, a.target);
};
e.vd = function(a) {
  Tg(this, a.target);
};
e.yc = function() {
  U(this, this.I) || Fg(this, ze(this, this.$ || U(this, 0)));
};
function Sg(a) {
  T(a).w(a, "select", a.wd).w(a, "unselect", a.xd).w(a, "disable", a.ud).w(a, "hide", a.vd);
}
fg("goog-tab-bar", function() {
  return new Rg;
});
function Vg() {
  S.call(this);
}
w(Vg, S);
Vg.prototype.h = null;
Vg.prototype.v = function() {
  delete this.h;
  Vg.m.v.call(this);
};
Vg.prototype.J = function() {
  this.b = this.a.C("DIV", "control-block");
  this.h && (B(this.h, this.c, this), this.h = null);
};
Vg.prototype.c = function(a) {
  var b = this.g();
  b ? (b.childNodes.length && b.appendChild(this.a.a.createTextNode("\u00a0\u00a0|\u00a0\u00a0")), b.appendChild(a)) : (this.h || (this.h = []), this.h.push(a));
};
function Wg(a) {
  V.call(this, void 0, !0);
  xf(this, a);
  K(this, Gf, this.Oa, !1, this);
}
w(Wg, V);
Wg.prototype.J = function() {
  Wg.m.J.call(this);
  var a = this.Ha(), b = this.rc();
  a.appendChild(b);
};
Wg.prototype.Y = function(a) {
  Wg.m.Y.call(this, a);
  a && this.D("show");
};
Wg.prototype.Oa = function(a) {
  "ok" == a.key && this.Jc() && this.D("action");
};
function Xg(a) {
  Wg.call(this, "Create a New Session");
  this.h = Ua(a, function(a) {
    return p(a) ? {browserName:a} : a;
  });
  K(this, "show", this.Pd, !1, this);
}
w(Xg, Wg);
e = Xg.prototype;
e.Fa = null;
e.v = function() {
  delete this.h;
  delete this.Fa;
  Xg.m.v.call(this);
};
e.rc = function() {
  function a(a) {
    var d = a.browserName;
    (a = a.version) && (d += " " + a);
    return b.C("OPTION", null, d);
  }
  var b = this.a;
  this.Fa = b.C("SELECT", null, a(""));
  B(this.h, function(b) {
    b = a(b);
    this.Fa.appendChild(b);
  }, this);
  return b.C("LABEL", null, "Browser:\u00a0", this.Fa);
};
e.Wb = function() {
  return this.h[this.Fa.selectedIndex - 1];
};
e.Jc = function() {
  return !!this.Fa.selectedIndex;
};
e.Pd = function() {
  this.Fa.selectedIndex = 0;
};
function Yg(a) {
  S.call(this);
  this.T = a;
}
w(Yg, S);
Yg.prototype.v = function() {
  delete this.T;
  Yg.m.v.call(this);
};
Yg.prototype.J = function() {
  var a = this.a;
  this.b = a.C("FIELDSET", null, a.C("LEGEND", null, this.T), this.sc());
};
Yg.prototype.sc = function() {
  return null;
};
function Zg() {
}
w(Zg, Yf);
ea(Zg);
e = Zg.prototype;
e.xb = function() {
  return "button";
};
e.ua = function(a, b, c) {
  switch(b) {
    case 8:
    ;
    case 16:
      Ee(a, "pressed", c);
      break;
    default:
    ;
    case 64:
    ;
    case 1:
      Zg.m.ua.call(this, a, b, c);
  }
};
e.Va = function(a) {
  var b = Zg.m.Va.call(this, a);
  this.sa(b, a.Sa());
  var c = a.ga;
  c && this.xc(b, c);
  a.V & 16 && this.ua(b, 16, !!(a.A & 16));
  return b;
};
e.xc = da;
e.Sa = function(a) {
  return a.title;
};
e.sa = function(a, b) {
  a && (b ? a.title = b : a.removeAttribute("title"));
};
e.X = function() {
  return "goog-button";
};
function $g() {
}
w($g, Zg);
ea($g);
e = $g.prototype;
e.xb = function() {
};
e.Va = function(a) {
  hg(a, !1);
  a.Pb &= -256;
  rg(a, 32, !1);
  return a.a.C("BUTTON", {"class":ag(this, a).join(" "), disabled:!a.isEnabled(), title:a.Sa() || "", value:a.ga || ""}, kg(a) || "");
};
e.zc = function(a) {
  T(a).w(a.g(), "click", a.kb);
};
e.Bc = da;
e.Cc = da;
e.Ac = function(a) {
  return a.isEnabled();
};
e.yb = da;
e.Xb = function(a, b, c) {
  $g.m.Xb.call(this, a, b, c);
  (a = a.g()) && 1 == b && (a.disabled = c);
};
e.xc = function(a, b) {
  a && (a.value = b);
};
e.ua = da;
function ah(a, b, c) {
  X.call(this, a, b || $g.Ga(), c);
}
w(ah, X);
e = ah.prototype;
e.Sa = function() {
  return this.F;
};
e.sa = function(a) {
  this.F = a;
  this.c.sa(this.g(), a);
};
e.Vc = function(a) {
  this.F = a;
};
e.v = function() {
  ah.m.v.call(this);
  delete this.ga;
  delete this.F;
};
e.U = function() {
  ah.m.U.call(this);
  if (this.V & 32) {
    var a = this.g();
    a && T(this).w(a, "keyup", this.Yb);
  }
};
e.Yb = function(a) {
  return 13 == a.a && "key" == a.type || 32 == a.a && "keyup" == a.type ? this.kb(a) : 32 == a.a;
};
fg("goog-button", function() {
  return new ah(null);
});
function bh(a) {
  a = String(a);
  if (/^\s*$/.test(a) ? 0 : /^[\],:{}\s\u2028\u2029]*$/.test(a.replace(/\\["\\\/bfnrtu]/g, "@").replace(/"[^"\\\n\r\u2028\u2029\x00-\x08\x0a-\x1f]*"|true|false|null|-?\d+(?:\.\d*)?(?:[eE][+\-]?\d+)?/g, "]").replace(/(?:^|:|,)(?:[\s\u2028\u2029]*\[)+/g, ""))) {
    try {
      return eval("(" + a + ")");
    } catch (b) {
    }
  }
  throw Error("Invalid JSON string: " + a);
}
function ch() {
}
function dh(a, b) {
  var c = [];
  eh(a, b, c);
  return c.join("");
}
function eh(a, b, c) {
  if (null == b) {
    c.push("null");
  } else {
    if ("object" == typeof b) {
      if (ga(b)) {
        var d = b;
        b = d.length;
        c.push("[");
        for (var f = "", g = 0;g < b;g++) {
          c.push(f), eh(a, d[g], c), f = ",";
        }
        c.push("]");
        return;
      }
      if (b instanceof String || b instanceof Number || b instanceof Boolean) {
        b = b.valueOf();
      } else {
        c.push("{");
        f = "";
        for (d in b) {
          Object.prototype.hasOwnProperty.call(b, d) && (g = b[d], "function" != typeof g && (c.push(f), fh(d, c), c.push(":"), eh(a, g, c), f = ","));
        }
        c.push("}");
        return;
      }
    }
    switch(typeof b) {
      case "string":
        fh(b, c);
        break;
      case "number":
        c.push(isFinite(b) && !isNaN(b) ? String(b) : "null");
        break;
      case "boolean":
        c.push(String(b));
        break;
      case "function":
        c.push("null");
        break;
      default:
        throw Error("Unknown type: " + typeof b);;
    }
  }
}
var gh = {'"':'\\"', "\\":"\\\\", "/":"\\/", "\b":"\\b", "\f":"\\f", "\n":"\\n", "\r":"\\r", "\t":"\\t", "\x0B":"\\u000b"}, hh = /\uffff/.test("\uffff") ? /[\\\"\x00-\x1f\x7f-\uffff]/g : /[\\\"\x00-\x1f\x7f-\xff]/g;
function fh(a, b) {
  b.push('"', a.replace(hh, function(a) {
    var b = gh[a];
    b || (b = "\\u" + (a.charCodeAt(0) | 65536).toString(16).substr(1), gh[a] = b);
    return b;
  }), '"');
}
;function ih(a, b) {
  null != a && this.a.apply(this, arguments);
}
ih.prototype.b = "";
ih.prototype.a = function(a, b, c) {
  this.b += a;
  if (null != b) {
    for (var d = 1;d < arguments.length;d++) {
      this.b += arguments[d];
    }
  }
  return this;
};
ih.prototype.clear = function() {
  this.b = "";
};
ih.prototype.toString = function() {
  return this.b;
};
function jh(a, b) {
  var c = Array.prototype.slice.call(arguments), d = c.shift();
  if ("undefined" == typeof d) {
    throw Error("[goog.string.format] Template required");
  }
  return d.replace(/%([0\-\ \+]*)(\d+)?(\.(\d+))?([%sfdiu])/g, function(a, b, d, k, l, q, t, y) {
    if ("%" == q) {
      return "%";
    }
    var D = c.shift();
    if ("undefined" == typeof D) {
      throw Error("[goog.string.format] Not enough arguments");
    }
    arguments[0] = D;
    return kh[q].apply(null, arguments);
  });
}
var kh = {s:function(a, b, c) {
  return isNaN(c) || "" == c || a.length >= c ? a : a = -1 < b.indexOf("-", 0) ? a + Ja(" ", c - a.length) : Ja(" ", c - a.length) + a;
}, f:function(a, b, c, d, f) {
  d = a.toString();
  isNaN(f) || "" == f || (d = parseFloat(a).toFixed(f));
  var g;
  g = 0 > a ? "-" : 0 <= b.indexOf("+") ? "+" : 0 <= b.indexOf(" ") ? " " : "";
  0 <= a && (d = g + d);
  if (isNaN(c) || d.length >= c) {
    return d;
  }
  d = isNaN(f) ? Math.abs(a).toString() : Math.abs(a).toFixed(f);
  a = c - d.length - g.length;
  return d = 0 <= b.indexOf("-", 0) ? g + d + Ja(" ", a) : g + Ja(0 <= b.indexOf("0", 0) ? "0" : " ", a) + d;
}, d:function(a, b, c, d, f, g, h, k) {
  return kh.f(parseInt(a, 10), b, c, d, 0, g, h, k);
}};
kh.i = kh.d;
kh.u = kh.d;
function lh() {
  this.a = new ch;
}
function mh(a) {
  var b = new lh;
  if (null == a) {
    return "";
  }
  if (p(a)) {
    if (/^[\s\xa0]*$/.test(a)) {
      return "";
    }
    a = bh(a);
  }
  var c = new ih;
  nh(b, a, c, 0);
  return c.toString();
}
function nh(a, b, c, d) {
  var f = fa(b);
  switch(f) {
    case "null":
    ;
    case "boolean":
    ;
    case "number":
    ;
    case "string":
      c.a(jh("", f), dh(a.a, b), jh("", f));
      break;
    case "array":
      c.a("[");
      for (var g = 0, g = 0;g < b.length;g++) {
        0 < g && c.a(","), c.a("\n"), c.a(Ja(" ", d + 2)), nh(a, b[g], c, d + 2);
      }
      0 < g && (c.a("\n"), c.a(Ja(" ", d)));
      c.a("]");
      break;
    case "object":
      c.a("{");
      f = 0;
      for (g in b) {
        b.hasOwnProperty(g) && (0 < f && c.a(","), c.a("\n"), c.a(Ja(" ", d + 2)), c.a("", dh(a.a, g), ""), c.a(":", " "), nh(a, b[g], c, d + 2), f++);
      }
      0 < f && (c.a("\n"), c.a(Ja(" ", d)));
      c.a("}");
      break;
    default:
      c.a(jh("", "unknown"), dh(a.a, ""), jh("", "unknown"));
  }
}
;function oh(a, b, c, d, f, g, h, k) {
  var l, q;
  if (l = c.offsetParent) {
    var t = "HTML" == l.tagName || "BODY" == l.tagName;
    t && "static" == Sd(l, "position") || (q = Zd(l), t || (t = (t = ee(l)) && F ? -l.scrollLeft : !t || E && H("8") || "visible" == Sd(l, "overflowX") ? l.scrollLeft : l.scrollWidth - l.clientWidth - l.scrollLeft, q = jd(q, new L(t, l.scrollTop))));
  }
  l = q || new L;
  q = ce(a);
  if (t = Yd(a)) {
    var y = new Md(t.left, t.top, t.right - t.left, t.bottom - t.top), t = Math.max(q.left, y.left), D = Math.min(q.left + q.width, y.left + y.width);
    if (t <= D) {
      var M = Math.max(q.top, y.top), y = Math.min(q.top + q.height, y.top + y.height);
      M <= y && (q.left = t, q.top = M, q.width = D - t, q.height = y - M);
    }
  }
  t = N(a);
  M = N(c);
  if (t.a != M.a) {
    var D = t.a.body, M = rd(M.a), y = new L(0, 0), Qa = qd(O(D)), ye = D;
    do {
      var db;
      Qa == M ? db = Zd(ye) : (db = Wd(ye), db = new L(db.left, db.top));
      y.x += db.x;
      y.y += db.y;
    } while (Qa && Qa != M && Qa != Qa.parent && (ye = Qa.frameElement) && (Qa = Qa.parent));
    D = jd(y, Zd(D));
    (M = !E) || (M = 9 <= Zb);
    M || Id(t) || (D = jd(D, Jd(t)));
    q.left += D.x;
    q.top += D.y;
  }
  a = ph(a, b);
  b = new L(a & 2 ? q.left + q.width : q.left, a & 1 ? q.top + q.height : q.top);
  b = jd(b, l);
  f && (b.x += (a & 2 ? -1 : 1) * f.x, b.y += (a & 1 ? -1 : 1) * f.y);
  var ma;
  h && (ma = Yd(c)) && (ma.top -= l.y, ma.right -= l.x, ma.bottom -= l.y, ma.left -= l.x);
  return qh(b, c, d, g, ma, h, k);
}
function qh(a, b, c, d, f, g, h) {
  a = a.clone();
  var k = ph(b, c);
  c = ae(b);
  h = h ? h.clone() : c.clone();
  a = a.clone();
  h = h.clone();
  var l = 0;
  if (d || 0 != k) {
    k & 2 ? a.x -= h.width + (d ? d.right : 0) : d && (a.x += d.left), k & 1 ? a.y -= h.height + (d ? d.bottom : 0) : d && (a.y += d.top);
  }
  if (g) {
    if (f) {
      d = a;
      k = h;
      l = 0;
      65 == (g & 65) && (d.x < f.left || d.x >= f.right) && (g &= -2);
      132 == (g & 132) && (d.y < f.top || d.y >= f.bottom) && (g &= -5);
      d.x < f.left && g & 1 && (d.x = f.left, l |= 1);
      if (g & 16) {
        var q = d.x;
        d.x < f.left && (d.x = f.left, l |= 4);
        d.x + k.width > f.right && (k.width = Math.min(f.right - d.x, q + k.width - f.left), k.width = Math.max(k.width, 0), l |= 4);
      }
      d.x + k.width > f.right && g & 1 && (d.x = Math.max(f.right - k.width, f.left), l |= 1);
      g & 2 && (l = l | (d.x < f.left ? 16 : 0) | (d.x + k.width > f.right ? 32 : 0));
      d.y < f.top && g & 4 && (d.y = f.top, l |= 2);
      g & 32 && (q = d.y, d.y < f.top && (d.y = f.top, l |= 8), d.y + k.height > f.bottom && (k.height = Math.min(f.bottom - d.y, q + k.height - f.top), k.height = Math.max(k.height, 0), l |= 8));
      d.y + k.height > f.bottom && g & 4 && (d.y = Math.max(f.bottom - k.height, f.top), l |= 2);
      g & 8 && (l = l | (d.y < f.top ? 64 : 0) | (d.y + k.height > f.bottom ? 128 : 0));
      f = l;
    } else {
      f = 256;
    }
    l = f;
  }
  g = new Md(0, 0, 0, 0);
  g.left = a.x;
  g.top = a.y;
  g.width = h.width;
  g.height = h.height;
  f = l;
  if (f & 496) {
    return f;
  }
  Td(b, new L(g.left, g.top));
  h = new kd(g.width, g.height);
  c == h || c && h && c.width == h.width && c.height == h.height || (c = h, a = Id(N(O(b))), !E || H("10") || a && H("8") ? (b = b.style, F ? b.MozBoxSizing = "border-box" : G ? b.WebkitBoxSizing = "border-box" : b.boxSizing = "border-box", b.width = Math.max(c.width, 0) + "px", b.height = Math.max(c.height, 0) + "px") : (h = b.style, a ? (E ? (a = ie(b, "paddingLeft"), g = ie(b, "paddingRight"), d = ie(b, "paddingTop"), k = ie(b, "paddingBottom"), a = new P(d, g, k, a)) : (a = Rd(b, "paddingLeft"), 
  g = Rd(b, "paddingRight"), d = Rd(b, "paddingTop"), k = Rd(b, "paddingBottom"), a = new P(parseFloat(d), parseFloat(g), parseFloat(k), parseFloat(a))), !E || 9 <= Zb ? (g = Rd(b, "borderLeftWidth"), d = Rd(b, "borderRightWidth"), k = Rd(b, "borderTopWidth"), b = Rd(b, "borderBottomWidth"), b = new P(parseFloat(k), parseFloat(d), parseFloat(b), parseFloat(g))) : (g = ke(b, "borderLeft"), d = ke(b, "borderRight"), k = ke(b, "borderTop"), b = ke(b, "borderBottom"), b = new P(k, d, b, g)), h.pixelWidth = 
  c.width - b.left - a.left - a.right - b.right, h.pixelHeight = c.height - b.top - a.top - a.bottom - b.bottom) : (h.pixelWidth = c.width, h.pixelHeight = c.height)));
  return f;
}
function ph(a, b) {
  return (b & 4 && ee(a) ? b ^ 2 : b) & -5;
}
;function rh() {
}
rh.prototype.a = function() {
};
function sh(a, b, c) {
  this.b = a;
  this.c = b;
  this.j = c;
}
w(sh, rh);
sh.prototype.a = function(a, b, c) {
  oh(this.b, this.c, a, b, void 0, c, this.j);
};
function th(a, b) {
  this.b = a instanceof L ? a : new L(a, b);
}
w(th, rh);
th.prototype.a = function(a, b, c, d) {
  oh(Vd(a), 0, a, b, this.b, c, null, d);
};
function uh(a, b) {
  this.ab = b || void 0;
  nf.call(this, a);
}
w(uh, nf);
uh.prototype.hb = function() {
  if (this.ab) {
    var a = !this.aa && "move_offscreen" != this.$a, b = this.g();
    a && (b.style.visibility = "hidden", Q(b, !0));
    this.ab.a(b, 4, this.Oa);
    a && Q(b, !1);
  }
};
function vh(a, b, c) {
  this.b = c || (a ? N(p(a) ? document.getElementById(a) : a) : N());
  uh.call(this, this.b.C("DIV", {style:"position:absolute;display:none;"}));
  this.l = new L(1, 1);
  this.G = new Mb;
  this.h = null;
  a && wh(this, a);
  null != b && Ad(this.g(), b);
}
w(vh, uh);
var xh = [];
e = vh.prototype;
e.N = null;
e.className = "goog-tooltip";
e.Kc = 0;
function wh(a, b) {
  b = p(b) ? document.getElementById(b) : b;
  a.G.add(b);
  K(b, "mouseover", a.Fc, !1, a);
  K(b, "mouseout", a.Bb, !1, a);
  K(b, "mousemove", a.Wa, !1, a);
  K(b, "focus", a.Ec, !1, a);
  K(b, "blur", a.Bb, !1, a);
}
e.Vb = function() {
  return this.Kc;
};
e.jc = function(a) {
  var b = this.g();
  b && yd(b);
  vh.m.jc.call(this, a);
  a ? (b = this.b.a.body, b.insertBefore(a, b.lastChild), z(this.h), this.h = new lf(this.g()), wa(this, oa(z, this.h)), K(this.h, "focusin", this.Qa, void 0, this), K(this.h, "focusout", this.mb, void 0, this)) : (z(this.h), this.h = null);
};
function yh(a) {
  return a.j ? a.aa ? 4 : 1 : a.M ? 3 : a.aa ? 2 : 0;
}
e.Fb = function(a) {
  if (!this.aa) {
    return !1;
  }
  var b = Zd(this.g()), c = ae(this.g());
  return b.x <= a.x && a.x <= b.x + c.width && b.y <= a.y && a.y <= b.y + c.height;
};
e.gc = function() {
  if (!nf.prototype.gc.call(this)) {
    return !1;
  }
  if (this.a) {
    for (var a, b = 0;a = xh[b];b++) {
      zd(a.g(), this.a) || a.za(!1);
    }
  }
  Xa(xh, this) || xh.push(this);
  a = this.g();
  a.className = this.className;
  this.Qa();
  K(a, "mouseover", this.cc, !1, this);
  K(a, "mouseout", this.Ic, !1, this);
  zh(this);
  return !0;
};
e.jb = function() {
  Ya(xh, this);
  for (var a = this.g(), b, c = 0;b = xh[c];c++) {
    b.a && zd(a, b.a) && b.za(!1);
  }
  this.Pa && this.Pa.mb();
  Zc(a, "mouseover", this.cc, !1, this);
  Zc(a, "mouseout", this.Ic, !1, this);
  this.a = void 0;
  0 == yh(this) && (this.oa = !1);
  nf.prototype.jb.call(this);
};
e.Nc = function(a, b) {
  this.a == a && this.G.contains(this.a) && (this.oa || !this.Wd ? (this.za(!1), this.aa || (this.a = a, this.ab = b || Ah(this, 0) || void 0, this.aa && this.hb(), this.za(!0))) : this.a = void 0);
  this.j = void 0;
};
e.Mc = function(a) {
  this.M = void 0;
  if (a == this.a) {
    a = this.b;
    var b;
    a: {
      var c = a.a;
      try {
        b = c && c.activeElement;
        break a;
      } catch (d) {
      }
      b = null;
    }
    b = b && this.g() && a.contains(this.g(), b);
    null != this.N && (this.N == this.g() || this.G.contains(this.N)) || b || this.o && this.o.N || this.za(!1);
  }
};
function Bh(a, b) {
  var c = Jd(a.b);
  a.l.x = b.clientX + c.x;
  a.l.y = b.clientY + c.y;
}
e.Fc = function(a) {
  var b = Ch(this, a.target);
  this.N = b;
  this.Qa();
  b != this.a && (this.a = b, this.j || (this.j = jf(v(this.Nc, this, b, void 0), 500)), Dh(this), Bh(this, a));
};
function Ch(a, b) {
  try {
    for (;b && !a.G.contains(b);) {
      b = b.parentNode;
    }
    return b;
  } catch (c) {
    return null;
  }
}
e.Wa = function(a) {
  Bh(this, a);
  this.oa = !0;
};
e.Ec = function(a) {
  this.N = a = Ch(this, a.target);
  this.oa = !0;
  if (this.a != a) {
    this.a = a;
    var b = Ah(this, 1);
    this.Qa();
    this.j || (this.j = jf(v(this.Nc, this, a, b), 500));
    Dh(this);
  }
};
function Ah(a, b) {
  if (0 == b) {
    var c = a.l.clone();
    return new Eh(c);
  }
  return new Fh(a.N);
}
function Dh(a) {
  if (a.a) {
    for (var b, c = 0;b = xh[c];c++) {
      zd(b.g(), a.a) && (b.o = a, a.Pa = b);
    }
  }
}
e.Bb = function(a) {
  var b = Ch(this, a.target), c = Ch(this, a.j);
  b != c && (b == this.N && (this.N = null), zh(this), this.oa = !1, !this.aa || a.j && zd(this.g(), a.j) ? this.a = void 0 : this.mb());
};
e.cc = function() {
  var a = this.g();
  this.N != a && (this.Qa(), this.N = a);
};
e.Ic = function(a) {
  var b = this.g();
  this.N != b || a.j && zd(b, a.j) || (this.N = null, this.mb());
};
function zh(a) {
  a.j && (m.clearTimeout(a.j), a.j = void 0);
}
e.mb = function() {
  2 == yh(this) && (this.M = jf(v(this.Mc, this, this.a), this.Vb()));
};
e.Qa = function() {
  this.M && (m.clearTimeout(this.M), this.M = void 0);
};
e.v = function() {
  var a;
  this.za(!1);
  zh(this);
  for (var b = this.G.ha(), c = 0;a = b[c];c++) {
    Zc(a, "mouseover", this.Fc, !1, this), Zc(a, "mouseout", this.Bb, !1, this), Zc(a, "mousemove", this.Wa, !1, this), Zc(a, "focus", this.Ec, !1, this), Zc(a, "blur", this.Bb, !1, this);
  }
  this.G.clear();
  this.g() && yd(this.g());
  this.N = null;
  delete this.b;
  vh.m.v.call(this);
};
function Eh(a, b) {
  th.call(this, a, b);
}
w(Eh, th);
Eh.prototype.a = function(a, b, c) {
  b = Vd(a);
  b = Yd(b);
  c = c ? new P(c.top + 10, c.right, c.bottom, c.left + 10) : new P(10, 0, 0, 10);
  qh(this.b, a, 4, c, b, 9) & 496 && qh(this.b, a, 4, c, b, 5);
};
function Fh(a) {
  sh.call(this, a, 3);
}
w(Fh, sh);
Fh.prototype.a = function(a, b, c) {
  var d = new L(10, 0);
  oh(this.b, this.c, a, b, d, c, 9) & 496 && oh(this.b, 2, a, 1, d, c, 5);
};
function Gh(a, b, c) {
  vh.call(this, a, b, c);
}
w(Gh, vh);
e = Gh.prototype;
e.tc = !1;
e.nb = !1;
e.Ab = function() {
  Gh.m.Ab.call(this);
  this.L = Nd(ce(this.g()));
  this.a && (this.Ea = Nd(ce(this.a)));
  this.nb = this.tc;
  K(this.b.a, "mousemove", this.Wa, !1, this);
};
e.jb = function() {
  Zc(this.b.a, "mousemove", this.Wa, !1, this);
  this.Ea = this.L = null;
  this.nb = !1;
  Gh.m.jb.call(this);
};
e.Fb = function(a) {
  if (this.F) {
    var b = Zd(this.g()), c = ae(this.g());
    return b.x - this.F.left <= a.x && a.x <= b.x + c.width + this.F.right && b.y - this.F.top <= a.y && a.y <= b.y + c.height + this.F.bottom;
  }
  return Gh.m.Fb.call(this, a);
};
function Hh(a, b) {
  if (a.Ea && a.Ea.contains(b) || a.Fb(b)) {
    return !0;
  }
  var c = a.o;
  return !!c && c.Fb(b);
}
e.Mc = function(a) {
  this.M = void 0;
  a != this.a || Hh(this, this.l) || this.N || this.o && this.o.N || F && 0 == this.l.x && 0 == this.l.y || this.za(!1);
};
e.Wa = function(a) {
  var b = this.aa;
  if (this.L) {
    var c = Jd(this.b), c = new L(a.clientX + c.x, a.clientY + c.y);
    Hh(this, c) ? b = !1 : this.nb && (b = Ld(this.L, c) >= Ld(this.L, this.l));
  }
  if (b) {
    if (this.mb(), this.N = null, b = this.o) {
      b.N = null;
    }
  } else {
    3 == yh(this) && this.Qa();
  }
  Gh.m.Wa.call(this, a);
};
e.cc = function() {
  this.N != this.g() && (this.nb = !1, this.N = this.g());
};
e.Vb = function() {
  return this.nb ? 100 : Gh.m.Vb.call(this);
};
function Ih() {
  vh.call(this, void 0, void 0, void 0);
  var a = this.b;
  this.ba = a.a.createElement("PRE");
  this.T = a.C("BUTTON", null, "Close");
  K(this.T, "click", v(this.za, this, !1));
  a = a.C("DIV", null, this.ba, a.a.createElement("HR"), a.C("DIV", {style:"text-align: center;"}, this.T));
  this.g().appendChild(a);
}
w(Ih, Gh);
Ih.prototype.v = function() {
  ad(this.T);
  delete this.T;
  delete this.ba;
  Ih.m.v.call(this);
};
function Jh() {
  S.call(this);
  this.c = new Vg;
  this.ka(this.c);
  this.B = new V(void 0, !0);
  xf(this.B, "Delete session?");
  yf(this.B, Kb("Are you sure you want to delete this session?", null));
  K(this.B, Gf, this.Oa, !1, this);
  this.F = new ah("Delete Session");
  this.ka(this.F);
  K(this.F, "action", v(this.B.Y, this.B, !0));
  this.h = new ah("Take Screenshot");
  this.ka(this.h);
  K(this.h, "action", this.Pa, !1, this);
  this.o = new Ih;
  this.o.F = new P(5, 5, 5, 5) || null;
  this.o.tc = !0;
  var a = this.o, b = new P(10, 0, 0, 0);
  null == b || b instanceof P ? a.Oa = b : a.Oa = new P(b, void 0, void 0, void 0);
  a.aa && a.hb();
  this.o.Kc = 250;
}
w(Jh, S);
Jh.prototype.v = function() {
  this.o.O();
  this.B.O();
  delete this.c;
  delete this.H;
  delete this.L;
  delete this.T;
  delete this.B;
  delete this.o;
  delete this.h;
  delete this.F;
  delete this.ba;
  Jh.m.v.call(this);
};
Jh.prototype.J = function() {
  this.h.J();
  this.F.J();
  this.c.J();
  var a = this.a;
  this.H = a.C("DIV", "goog-tab-content empty-view", "No Sessions");
  this.T = a.a.createElement("SPAN");
  this.ba = a.C("DIV", "todo", "\u00a0");
  this.ba.disabled = !0;
  this.c.c(this.T);
  var b;
  this.c.c(b = a.C("SPAN", "session-capabilities", "Capabilities"));
  this.c.c(this.h.g());
  this.c.c(this.F.g());
  this.L = a.C("DIV", "goog-tab-content", this.c.g(), this.ba);
  this.b = a.C("DIV", null, this.H, this.L, a.C("DIV", "goog-tab-bar-clear"));
  Kh(this, null);
  wh(this.o, b);
};
function Kh(a, b) {
  var c = !!b;
  Q(a.H, !c);
  Q(a.L, c);
  b && (Ad(a.T, b.P()), a.o.ba.innerHTML = mh(b.a || {}), Lh(b.a, "takesScreenshot") ? (a.h.ja(!0), a.h.sa("")) : (a.h.ja(!1), a.h.sa("Screenshots not supported")));
}
Jh.prototype.Oa = function(a) {
  "ok" == a.key && this.D("delete");
};
Jh.prototype.Pa = function() {
  this.D("screenshot");
};
function Mh(a) {
  Yg.call(this, "Sessions");
  this.c = new Rg(Pg, null);
  this.o = new Jh;
  this.B = new Xg(a);
  this.H = this.a.C("BUTTON", null, "Create Session");
  this.L = this.a.C("BUTTON", null, "Refresh Sessions");
  this.F = new Vg;
  this.h = [];
  this.ba = setInterval(v(this.Vd, this), 300);
  this.ka(this.c);
  this.ka(this.o);
  this.ka(this.F);
  this.ja(!1);
  this.F.c(this.H);
  this.F.c(this.L);
  K(this.H, "click", v(this.B.Y, this.B, !0));
  K(this.L, "click", v(this.D, this, "refresh"));
  K(this.c, "select", this.Ld, !1, this);
  K(this.B, "action", this.Dd, !1, this);
}
w(Mh, Yg);
e = Mh.prototype;
e.v = function() {
  ad(this.H);
  ad(this.L);
  clearInterval(this.ba);
  this.B.O();
  delete this.B;
  delete this.c;
  delete this.o;
  delete this.F;
  delete this.h;
  delete this.ba;
  Mh.m.v.call(this);
};
e.sc = function() {
  this.c.J();
  this.o.J();
  this.F.J();
  return this.a.C("DIV", "session-container", this.F.g(), this.c.g(), this.o.g());
};
e.ja = function(a) {
  a ? (this.H.removeAttribute("disabled"), this.L.removeAttribute("disabled")) : (this.H.setAttribute("disabled", "disabled"), this.L.setAttribute("disabled", "disabled"));
};
function Nh(a) {
  return (a = a.c.$) ? a.Ja : null;
}
e.Vd = function() {
  if (this.h.length) {
    var a = this.h[0].Ia, a = 5 === a.length ? "." : a + ".";
    B(this.h, function(b) {
      var c = a;
      eg(b.g(), c);
      b.Ia = c;
    });
  }
};
function Oh(a) {
  var b = ae(a.c.g());
  a = a.o;
  b = b.height + 20;
  Od(a.H, "height", b + "px");
  Od(a.L, "height", b + "px");
}
e.nc = function(a) {
  a = new Ph(a);
  var b = this.h.shift(), c = ze(this.c, b);
  0 > c ? this.c.ka(a, !0) : (this.c.rb(a, c, !0), this.c.removeChild(b, !0));
  Oh(this);
  Ug(this.c, a);
};
function Qh(a, b) {
  var c = new jb;
  B(b, function(a) {
    c.ra(a.P(), a);
  });
  for (var d = a.c, f = d.$, g = [], h = we(d) - a.h.length, k = 0;k < h;++k) {
    g.push(U(d, k));
  }
  B(g, function(a) {
    var b = a.Ja.P(), g = mb(c, b);
    g ? (c.remove(b), a.Ja = g) : (d.removeChild(a, !0), f === a && (f = null));
  }, a);
  B(a.h, function(a) {
    d.removeChild(a, !0);
  });
  a.h = [];
  B(c.ha(), a.nc, a);
  f ? (Kh(a.o, f.Ja), Ug(d, f)) : we(d) ? Ug(d, U(d, 0)) : Kh(a.o, null);
}
e.Dd = function() {
  var a = ".";
  this.h.length && (a = this.h[0].Ia);
  a = new ug(a, null, this.a);
  a.ja(!1);
  this.h.push(a);
  this.c.ka(a, !0);
  Oh(this);
  this.D(new Be("create", this, this.B.Wb()));
};
e.Ld = function() {
  var a = this.c.$;
  Kh(this.o, a ? a.Ja : null);
};
function Ph(a) {
  var b = Lh(a.a, "browserName") || "unknown browser", b = b.toLowerCase().replace(/(^|\b)[a-z]/g, function(a) {
    return a.toUpperCase();
  });
  ug.call(this, b);
  this.Ja = a;
}
w(Ph, ug);
Ph.prototype.v = function() {
  delete this.Ja;
  Ph.m.v.call(this);
};
function Rh(a, b) {
  S.call(this, b);
  this.h = a || "";
}
var Sh;
w(Rh, S);
e = Rh.prototype;
e.wa = null;
function Th() {
  null != Sh || (Sh = "placeholder" in document.createElement("INPUT"));
  return Sh;
}
e.Eb = !1;
e.J = function() {
  this.b = this.a.C("INPUT", {type:"text"});
};
e.U = function() {
  Rh.m.U.call(this);
  var a = new le(this);
  a.w(this.g(), "focus", this.Hc);
  a.w(this.g(), "blur", this.hd);
  Th() ? this.c = a : (F && a.w(this.g(), ["keypress", "keydown", "keyup"], this.nd), a.w(qd(O(this.g())), "load", this.zd), this.c = a, Uh(this));
  Vh(this);
  this.g().a = this;
};
e.da = function() {
  Rh.m.da.call(this);
  this.c && (this.c.O(), this.c = null);
  this.g().a = null;
};
function Uh(a) {
  !a.o && a.c && a.g().form && (a.c.w(a.g().form, "submit", a.od), a.o = !0);
}
e.v = function() {
  Rh.m.v.call(this);
  this.c && (this.c.O(), this.c = null);
};
e.Hc = function() {
  this.Eb = !0;
  Je(this.g(), "label-input-label");
  if (!Th() && !Wh(this) && !this.B) {
    var a = this, b = function() {
      a.g() && (a.g().value = "");
    };
    E ? jf(b, 10) : b();
  }
};
e.hd = function() {
  Th() || (this.c.ma(this.g(), "click", this.Hc), this.wa = null);
  this.Eb = !1;
  Vh(this);
};
e.nd = function(a) {
  27 == a.a && ("keydown" == a.type ? this.wa = this.g().value : "keypress" == a.type ? this.g().value = this.wa : "keyup" == a.type && (this.wa = null), a.b());
};
e.od = function() {
  Wh(this) || (this.g().value = "", jf(this.gd, 10, this));
};
e.gd = function() {
  Wh(this) || (this.g().value = this.h);
};
e.zd = function() {
  Vh(this);
};
function Wh(a) {
  return !!a.g() && "" != a.g().value && a.g().value != a.h;
}
e.clear = function() {
  this.g().value = "";
  null != this.wa && (this.wa = "");
};
e.reset = function() {
  Wh(this) && (this.clear(), Vh(this));
};
function Vh(a) {
  var b = a.g();
  Th() ? a.g().placeholder != a.h && (a.g().placeholder = a.h) : Uh(a);
  Ee(b, "label", a.h);
  Wh(a) ? (b = a.g(), Je(b, "label-input-label")) : (a.B || a.Eb || (b = a.g(), He(b, "label-input-label")), Th() || jf(a.Rd, 10, a));
}
e.ja = function(a) {
  this.g().disabled = !a;
  var b = this.g();
  a ? Je(b, "label-input-label-disabled") : He(b, "label-input-label-disabled");
};
e.isEnabled = function() {
  return !this.g().disabled;
};
e.Rd = function() {
  !this.g() || Wh(this) || this.Eb || (this.g().value = this.h);
};
function Xh() {
  Wg.call(this, "Open WebDriverJS Script");
  K(this, "show", this.Qd, !1, this);
  this.h = new Rh("Script URL");
  this.ka(this.h);
}
w(Xh, Wg);
e = Xh.prototype;
e.v = function() {
  delete this.h;
  Xh.m.v.call(this);
};
e.rc = function() {
  var a = sd("A", {href:"https://github.com/SeleniumHQ/selenium/wiki/WebDriverJs", target:"_blank"}, "WebDriverJS");
  this.h.J();
  He(this.h.g(), "url-input");
  var b = this.a;
  return b.C("DIV", null, b.C("P", null, "Open a page that has the ", a, " client. The page will be opened with the query parameters required to communicate with the server."), this.h.g());
};
e.Qd = function() {
  this.h.clear();
  this.h.g().focus();
  this.h.g().blur();
};
e.Wb = function() {
  var a = this.h;
  return null != a.wa ? a.wa : Wh(a) ? a.g().value : "";
};
e.Jc = function() {
  return Wh(this.h);
};
function Yh() {
  ah.call(this, "Load Script");
  this.o = new Xh;
  K(this.o, "action", this.H, !1, this);
  K(this, "action", v(this.o.Y, this.o, !0));
}
w(Yh, ah);
Yh.prototype.v = function() {
  this.o.O();
  delete this.o;
  Yh.m.v.call(this);
};
Yh.prototype.H = function() {
  this.D(new Be("loadscript", this, this.o.Wb()));
};
function Zh(a) {
  this.a = a;
  this.b = {};
}
function $h(a, b, c) {
  a.b[b] = c;
  return a;
}
;function ai() {
}
;function bi(a) {
  this.a = {};
  a && ci(this, a);
}
w(bi, ai);
function ci(a, b) {
  var c = b instanceof bi ? b.a : b, d;
  for (d in c) {
    if (c.hasOwnProperty(d)) {
      var f = a, g = d, h = c[d];
      null != h ? f.a[g] = h : delete f.a[g];
    }
  }
  return a;
}
function Lh(a, b) {
  var c = null;
  a.a.hasOwnProperty(b) && (c = a.a[b]);
  return null != c ? c : null;
}
;function di(a, b) {
  this.b = a;
  this.a = ci(new bi, b);
}
di.prototype.P = function() {
  return this.b;
};
di.prototype.toJSON = function() {
  return this.P();
};
function ei() {
  this.j = {};
}
ei.prototype.h = function(a, b) {
  var c = Array.prototype.slice.call(arguments, 1), d = this.j[a];
  if (d) {
    for (var f = 0;f < d.length;) {
      var g = d[f];
      g.Ra.apply(g.scope, c);
      d[f] === g && (d[f].Nd ? d.splice(f, 1) : f += 1);
    }
  }
};
function fi(a, b) {
  var c = a.j[b];
  c || (c = a.j[b] = []);
  return c;
}
function gi(a, b, c, d) {
  b = fi(a, b);
  for (var f = b.length, g = 0;g < f;++g) {
    if (b[g].Ra == c) {
      return a;
    }
  }
  b.push({Ra:c, scope:d, Nd:!0});
  return a;
}
function hi(a, b, c, d) {
  return gi(a, b, c, d);
}
ei.prototype.lb = function(a) {
  n(a) ? delete this.j[a] : this.j = {};
  return this;
};
if (!r(Error.captureStackTrace)) {
  try {
    throw Error();
  } catch (ii) {
  }
}
;/*
 Portions of this code are from the Dojo toolkit, received under the
 BSD License:
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:

 Redistributions of source code must retain the above copyright notice,
     this list of conditions and the following disclaimer.
 Redistributions in binary form must reproduce the above copyright notice,
     this list of conditions and the following disclaimer in the documentation
     and/or other materials provided with the distribution.
 Neither the name of the Dojo Foundation nor the names of its contributors
     may be used to endorse or promote products derived from this software
     without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 POSSIBILITY OF SUCH DAMAGE.
*/
function Z(a, b, c) {
  var d = ic;
  1 < a ? d = kc : 0 < a && (d = jc);
  "function" === typeof b && (b = b.bind(c));
  (a = ji) && a.log(d, b, void 0);
}
var ji = qc("webdriver.promise");
function ki(a) {
  xa.call(this, a);
  this.name = "CancellationError";
  this.a = !1;
}
w(ki, xa);
function li(a, b) {
  var c;
  if (a instanceof ki) {
    return new ki(b ? b + ": " + a.message : a.message);
  }
  if (b) {
    return c = b, a && (c += ": " + a), new ki(c);
  }
  a && (c = a + "");
  return new ki(c);
}
function mi() {
  ki.call(this, "ControlFlow was reset");
  this.name = "FlowResetError";
  this.a = !0;
}
w(mi, ki);
function ni(a) {
  if (a instanceof ni) {
    return a;
  }
  var b = "";
  a && (b = ": " + ("string" === typeof a.message ? a.message : a));
  ki.call(this, "Task was discarded due to a previous failure" + b);
  this.name = "DiscardedTaskError";
  this.a = !0;
}
w(ni, ki);
function oi() {
  xa.call(this, "Multiple unhandled promise rejections reported");
  this.name = "MultipleUnhandledRejectionError";
}
w(oi, xa);
function pi(a) {
  a.prototype.then = a.prototype.then;
  try {
    Object.defineProperty(a.prototype, "$webdriver_Thenable", {value:!0, enumerable:!1});
  } catch (b) {
    a.prototype.$webdriver_Thenable = !0;
  }
}
function qi(a) {
  if (!a) {
    return !1;
  }
  try {
    return !!a.$webdriver_Thenable;
  } catch (b) {
    return !1;
  }
}
var ri = Symbol("on cancel");
function si(a, b) {
  u(this);
  this.j = b || Pa() || ti;
  this.b = this.c = this.Nb = null;
  this.A = "pending";
  this.l = !1;
  this.ga = void 0;
  this.a = null;
  this[ri] = null;
  try {
    var c = this;
    a(function(a) {
      ui(c, "fulfilled", a);
    }, function(a) {
      ui(c, "rejected", a);
    });
  } catch (d) {
    ui(this, "rejected", d);
  }
}
e = si.prototype;
e.toString = function() {
  return "Promise::" + u(this) + ' {[[PromiseStatus]]: "' + this.A + '"}';
};
function ui(a, b, c) {
  if ("pending" === a.A) {
    c === a && (c = new TypeError("A promise may not resolve to itself"), b = "rejected");
    a.c = null;
    a.A = "blocked";
    if ("rejected" !== b) {
      if (qi(c)) {
        c.then(a.ob.bind(a, "fulfilled"), a.ob.bind(a, "rejected"));
        return;
      }
      if (ia(c)) {
        try {
          var d = c.then;
        } catch (f) {
          a.A = "rejected";
          a.ga = f;
          vi(a);
          return;
        }
        if ("function" === typeof d) {
          wi(a, c, d);
          return;
        }
      }
    }
    "rejected" === b && (c instanceof Error || ia(c) && (p(c.message) || c.Yd)) && c.stack && a.Nb && (c.stack += "\nFrom: " + (a.Nb.stack || a.Nb));
    a.A = b;
    a.ga = c;
    vi(a);
  }
}
function wi(a, b, c) {
  function d(b) {
    g || (g = !0, a.ob("rejected", b));
  }
  function f(b) {
    g || (g = !0, a.ob("fulfilled", b));
  }
  var g = !1;
  try {
    c.call(b, f, d);
  } catch (h) {
    d(h);
  }
}
e.ob = function(a, b) {
  "blocked" === this.A && (this.A = "pending", ui(this, a, b));
};
function vi(a) {
  Z(2, function() {
    return a + " scheduling notifications";
  }, a);
  a[ri] = null;
  a.ga instanceof ki && a.ga.a && (a.b = null);
  a.a || (a.a = xi(a.j));
  a.l || "rejected" !== a.A || a.ga instanceof ki || yi(a.a, a);
  zi(a.a, a);
}
e.cancel = function(a) {
  function b(a) {
    return "pending" === a.A || "blocked" === a.A;
  }
  b(this) && (this.c && b(this.c) ? this.c.cancel(a) : (a = li(a), this[ri] && (this[ri](a), this[ri] = null), "blocked" === this.A ? this.ob("rejected", a) : ui(this, "rejected", a)));
};
e.Gb = function() {
  return "pending" === this.A;
};
e.then = function(a, b) {
  return Ai(this, a, b, "then");
};
e.mc = function(a) {
  return Ai(this, null, a, "catch");
};
e.Na = function(a) {
  return this.mc(a);
};
function Ai(a, b, c, d) {
  if (!r(b) && !r(c)) {
    return a;
  }
  a.l = !0;
  a.a && Bi(a.a, a);
  b = new Ci(a.j, a.Bd.bind(a, b, c), d, void 0);
  b.a.c = a;
  if ("pending" === a.A || "blocked" === a.A) {
    a.b || (a.b = []), a.b.push(b), b.j = !0;
  }
  Di(xi(a.j), b);
  return b.a;
}
e.Bd = function(a, b) {
  var c = a;
  "rejected" === this.A && (c = b);
  if (r(c)) {
    return "GeneratorFunction" === c.constructor.name ? Ei(c, null, this.ga) : c(this.ga);
  }
  if ("rejected" === this.A) {
    throw this.ga;
  }
  return this.ga;
};
pi(si);
function Fi(a) {
  function b(a) {
    if (a === f) {
      throw new TypeError("May not resolve a Deferred with itself");
    }
  }
  var c, d;
  this.a = new si(function(a, b) {
    c = a;
    d = b;
  }, a);
  var f = this;
  this.h = function(a) {
    b(a);
    c(a);
  };
  this.c = function(a) {
    b(a);
    d(a);
  };
}
e = Fi.prototype;
e.Gb = function() {
  return this.a.Gb();
};
e.cancel = function(a) {
  this.a.cancel(a);
};
e.then = function(a, b) {
  return this.a.then(a, b);
};
e.mc = function(a) {
  return this.a.mc(a);
};
e.Na = function(a) {
  return this.a.Na(a);
};
pi(Fi);
function Gi() {
  this.j = {};
  this.l = this.c = this.a = this.b = null;
}
w(Gi, ei);
e = Gi.prototype;
e.toString = function() {
  return Hi(this);
};
e.reset = function() {
  Ii(this, new mi);
  this.h(Ji);
  this.lb();
  this.c && (this.c.cancel(), this.c = null);
};
function Hi(a) {
  function b(a, c) {
    var f = a.toString();
    a === d && (f = "(active) " + f);
    var l = c + "| ";
    a.S && (a.S.q.A !== Ki ? (f += "\n" + l + "(pending) " + a.S.Ca, f += "\n" + b(a.S.q, l + "| ")) : f += "\n" + l + "(blocked) " + a.S.Ca);
    a.Z && a.Z.forEach(function(a) {
      f += "\n" + l + a;
    });
    a.fa && a.fa.forEach(function(a) {
      return f += "\n" + l + a;
    });
    return c + f;
  }
  var c = "ControlFlow::" + u(a), d = a.b;
  if (!a.a || !a.a.size) {
    return c;
  }
  a = ca(a.a);
  for (var f = a.next();!f.done;f = a.next()) {
    c += "\n" + b(f.value, "| ");
  }
  return c;
}
function xi(a) {
  if (a.b) {
    return a.b;
  }
  a.b = new Li(a);
  a.a || (a.a = new Set);
  a.a.add(a.b);
  hi(gi(a.b, "end", a.Id, a), "error", a.Jd, a);
  cf(function() {
    return a.b = null;
  }, a);
  Mi(a.b);
  return a.b;
}
e.async = function(a, b, c) {
  cf(function() {
    this.b = null;
    var d = xi(this);
    try {
      Ni(d, a.bind(b, c));
    } catch (f) {
      var g = li(f, "Function passed to ControlFlow.async() threw");
      g.a = !0;
      Oi(d, g);
    } finally {
      this.b = null;
    }
  }, this);
};
e.Id = function(a) {
  var b = this;
  this.a && (this.a.delete(a), Z(1, function() {
    return a + " has finished";
  }), Z(1, function() {
    return b.a.size + " queues remain\n" + b;
  }, this), this.a.size || (this.c = new Pi(this.Ud, this)));
};
e.Jd = function(a, b) {
  this.a && this.a.delete(b);
  Ii(this, li(a, "There was an uncaught error in the control flow"));
  this.c && (this.c.cancel(), this.c = null);
  this.l && (clearInterval(this.l), this.l = null);
  fi(this, Qi).length ? this.h(Qi, a) : $e(a);
};
function Ii(a, b) {
  b.a = !0;
  if (a.a) {
    for (var c = ca(a.a), d = c.next();!d.done;d = c.next()) {
      d = d.value, d.lb(), Oi(d, b);
    }
    a.a.clear();
    a.a = null;
  }
}
e.Ud = function() {
  var a = this;
  Z(1, function() {
    return "Going idle: " + a;
  });
  this.l && (clearInterval(this.l), this.l = null);
  this.c = null;
  this.h(Ri);
};
var Ri = "idle", Ji = "reset", Qi = "uncaughtException";
function Pi(a, b) {
  this.a = !1;
  cf(function() {
    this.a || a.call(b);
  }, this);
}
Pi.prototype.cancel = function() {
  this.a = !0;
};
function Ci(a, b, c, d) {
  Fi.call(this, a);
  this.o = b;
  this.l = c;
  this.b = null;
  this.j = !1;
  d && (a = this.a, c = d.top, b = Error(this.l), b.name = d.name, Error.captureStackTrace ? Error.captureStackTrace(b, c) : (b ? (d = b.stack || b.b || "", c = b + "\n", 0 == d.lastIndexOf(c, 0) && (d = d.substring(c.length))) : d = "", b.stack = b.toString(), d && (b.stack += "\n" + d)), a.Nb = b);
}
w(Ci, Fi);
Ci.prototype.toString = function() {
  return "Task::" + u(this) + "<" + this.l + ">";
};
var Ki = "finished";
function Li(a) {
  this.j = {};
  u(this);
  u(this);
  this.a = a;
  this.fa = [];
  this.S = this.Z = null;
  this.A = "new";
  this.b = new Set;
}
w(Li, ei);
Li.prototype.toString = function() {
  return "TaskQueue::" + u(this);
};
function yi(a, b) {
  Z(2, function() {
    return a + " registering unhandled rejection: " + b;
  }, a);
  a.b.add(b);
}
function Bi(a, b) {
  a.b.delete(b) && Z(2, function() {
    return a + " clearing unhandled rejection: " + b;
  }, a);
}
function Di(a, b) {
  if ("new" !== a.A) {
    throw Error("TaskQueue has started: " + a);
  }
  if (b.b) {
    throw Error("Task is already scheduled in another queue");
  }
  a.fa.push(b);
  b.b = a;
  b.a[ri] = a.l.bind(a, b);
  Z(1, function() {
    return a + ".enqueue(" + b + ")";
  }, a);
  Z(2, function() {
    return a.a.toString();
  }, a);
}
function zi(a, b) {
  if (a.A === Ki) {
    throw Error("cannot interrupt a finished q(" + a + ")");
  }
  a.S && a.S.Ca.a === b && (a.S.Ca.a.a = null, a.S = null, cf(a.c, a));
  b.b && (b.b.forEach(function(a) {
    a.j = !1;
    a.b || (a.a[ri] = this.l.bind(this, a), a.b === this && -1 !== this.fa.indexOf(a)) || (a.b && Si(a.b, a), a.b = this, this.Z || (this.Z = []), this.Z.push(a));
  }, a), b.b = null, Z(2, function() {
    return a + " interrupted\n" + a.a;
  }, a));
}
function Mi(a) {
  if ("new" !== a.A) {
    throw Error("TaskQueue has already started");
  }
  cf(a.c, a);
}
function Oi(a, b) {
  var c;
  b instanceof mi ? c = b : c = new ni(b);
  a.Z && a.Z.length && (a.Z.forEach(function(a) {
    return a.c(c);
  }), a.Z = []);
  a.fa && a.fa.length && (a.fa.forEach(function(a) {
    return a.c(c);
  }), a.fa = []);
  a.S ? (Z(2, function() {
    return a + ".abort(); cancelling pending task";
  }, a), a.S.Ca.cancel(b)) : (Z(2, function() {
    return a + ".abort(); emitting error event";
  }, a), a.h("error", b, a));
}
Li.prototype.c = function() {
  if (this.A !== Ki && (this.A = "started", null == this.S && !Ti(this))) {
    var a;
    do {
      a = Ui(this);
    } while (a && !a.a.Gb());
    if (a) {
      var b = this, c = new Li(this.a);
      hi(hi(c, "end", function() {
        b.S && b.S.Ca.h(d);
      }), "error", function(a) {
        qi(d) && d.cancel(li(a));
        b.S.Ca.c(a);
      });
      Z(2, function() {
        return b + " created " + c + " for " + a;
      });
      var d = void 0;
      try {
        this.S = {Ca:a, q:c}, a.a.a = this, d = Ni(c, a.o), Mi(c);
      } catch (f) {
        Oi(c, f);
      }
    } else {
      var g = this;
      this.A = Ki;
      this.fa = [];
      this.Z = null;
      Z(2, function() {
        return g + ".emit(end)";
      }, this);
      this.h("end", this);
    }
  }
};
function Ni(a, b) {
  try {
    return Ra.push(a.a), a.a.b = a, b();
  } finally {
    a.a.b = null, Ra.pop();
  }
}
function Ti(a) {
  if (!a.b.size) {
    return !1;
  }
  for (var b = new Set, c = ca(a.b), d = c.next();!d.done;d = c.next()) {
    b.add(d.value.ga);
  }
  a.b.clear();
  b = 1 === b.size ? b.values().next().value : new oi;
  Z(1, function() {
    return a + " aborting due to unhandled rejections";
  }, a);
  Oi(a, b);
  return !0;
}
function Si(a, b) {
  var c;
  if (a.Z && (c = a.Z.indexOf(b), -1 != c)) {
    b.b = null;
    a.Z.splice(c, 1);
    return;
  }
  c = a.fa.indexOf(b);
  -1 != c && (b.b = null, a.fa.splice(c, 1));
}
Li.prototype.l = function(a, b) {
  this.S && this.S.Ca === a ? Oi(this.S.q, b) : Si(this, a);
};
function Ui(a) {
  for (var b = void 0, c = {pb:void 0};;) {
    a.Z && (b = a.Z.shift());
    !b && a.fa && (b = a.fa.shift());
    if (b && b.j) {
      c.pb = a, Z(2, function(a) {
        return function() {
          return a.pb + " skipping blocked task " + b;
        };
      }(c), a), b = b.b = null;
    } else {
      break;
    }
    c = {pb:c.pb};
  }
  return b;
}
var ti = new Gi, Ra = [];
function Ei(a, b, c) {
  function d(a) {
    g(k.next, a);
  }
  function f(a) {
    g(k["throw"], a);
  }
  function g(a, b) {
    if (h.Gb()) {
      try {
        var c = a.call(k, b);
      } catch (g) {
        h.c(g);
        return;
      }
      if (c.done) {
        h.h(c.value);
      } else {
        var c = c.value, D = d, M = f;
        c && ia(c) && "function" === typeof c.then ? c.then(D, M) : c && ia(c) && r(c.ad) ? c.ad(D, M) : D && D(c);
      }
    }
  }
  if ("GeneratorFunction" !== a.constructor.name) {
    throw new TypeError("Input is not a GeneratorFunction: " + a.constructor.name);
  }
  var h = new Fi, k = a.apply(b, bb(arguments, 2));
  d();
  return h.a;
}
;function Vi(a, b) {
  ta.call(this);
  this.b = qc("remote.ui.Client");
  this.h = new wc;
  xc(this.h, !0);
  this.M = a;
  this.o = b;
  this.c = new Ae;
  this.G = new Of;
  this.a = new Mh(Wi);
  this.j = new Lf;
  this.l = new Yh;
  K(this.a, "create", this.Ed, !1, this);
  K(this.a, "delete", this.Fd, !1, this);
  K(this.a, "refresh", this.Sc, !1, this);
  K(this.a, "screenshot", this.Od, !1, this);
  K(this.l, "loadscript", this.Hd, !1, this);
}
w(Vi, ta);
var Wi = "android;chrome;firefox;internet explorer;iphone;opera".split(";");
e = Vi.prototype;
e.v = function() {
  this.c.O();
  this.a.O();
  this.j.O();
  this.l.O();
  xc(this.h, !1);
  delete this.b;
  delete this.o;
  delete this.h;
  delete this.a;
  delete this.c;
  delete this.j;
  delete this.l;
  Vi.m.v.call(this);
};
function Xi(a) {
  ue(a.c, void 0);
  a.c.Lb(!1);
  ue(a.a, void 0);
  ue(a.G, void 0);
  ue(a.l, void 0);
  a.a.o.c.c(a.l.g());
  Yi(a).then(v(function() {
    this.a.ja(!0);
    this.Sc();
  }, a));
}
function Zi(a, b) {
  a.c.Lb(!1);
  return $i(a.o, b).then(sa);
}
function aj(a, b, c) {
  var d = a.b;
  d && d.log(ec, b + "\n" + c, void 0);
  c = a.c;
  c.a.Td(c.g(), b);
  c.Mb();
  a.c.Lb(!0);
}
function Yi(a) {
  fd(a.b, "Retrieving server status...");
  return Zi(a, new Zh("getStatus")).then(v(function(a) {
    var c = a.value || {};
    (a = c.os) && a.name && (a = a.name + (a.version ? " " + a.version : ""));
    c = c.build;
    Pf(this.G, a, c && c.version, c && c.revision);
  }, a));
}
e.Sc = function() {
  fd(this.b, "Refreshing sessions...");
  var a = this;
  Zi(this, new Zh("getSessions")).then(function(b) {
    b = b.value;
    b = Ua(b, function(a) {
      return new di(a.id, a.capabilities);
    });
    Qh(a.a, b);
  }).Na(function(b) {
    aj(a, "Unable to refresh session list.", b);
  });
};
e.Ed = function(a) {
  fd(this.b, "Creating new session for " + a.data.browserName);
  a = $h(new Zh("newSession"), "desiredCapabilities", a.data);
  var b = this;
  Zi(this, a).then(function(a) {
    a = new di(a.sessionId, a.value);
    b.a.nc(a);
  }).Na(function(a) {
    aj(b, "Unable to create new session.", a);
    a = b.a;
    var d = a.h.shift();
    d && (a.c.removeChild(d, !0), Oh(a));
  });
};
e.Fd = function() {
  var a = Nh(this.a);
  if (a) {
    fd(this.b, "Deleting session: " + a.P());
    var b = $h(new Zh("quit"), "sessionId", a.P()), c = this;
    Zi(this, b).then(function() {
      for (var b = c.a, f = b.c.$, g, h = we(b.c), k = 0;k < h;++k) {
        var l = U(b.c, k);
        if (l.Ja.P() == a.P()) {
          g = l;
          break;
        }
      }
      g && (b.c.removeChild(g, !0), g.O(), f == g && we(b.c) ? (b = b.c, Ug(b, U(b, 0))) : Kh(b.o, null));
    }).Na(function(a) {
      aj(c, "Unable to delete session.", a);
    });
  } else {
    ed(this.b, "Cannot delete session; no session selected!");
  }
};
e.Hd = function(a) {
  var b = Nh(this.a);
  if (b) {
    a = new pb(a.data);
    a.b.add("wdsid", b.P());
    a.b.add("wdurl", this.M);
    var c = $h($h(new Zh("get"), "sessionId", b.P()), "url", a.toString());
    fd(this.b, "In session(" + b.P() + "), loading " + a);
    Zi(this, c).Na(v(function(a) {
      aj(this, "Unable to load URL", a);
    }, this));
  } else {
    ed(this.b, "Cannot load url: " + a.data + "; no session selected!");
  }
};
e.Od = function() {
  var a = Nh(this.a);
  if (a) {
    fd(this.b, "Taking screenshot: " + a.P());
    a = $h(new Zh("screenshot"), "sessionId", a.P());
    Mf(this.j, Nf);
    this.j.Y(!0);
    var b = this;
    Zi(this, a).then(function(a) {
      var d = b.j;
      a = a.value;
      if (d.ya) {
        Mf(d, 1);
        a = "data:image/png;base64," + a;
        var f = d.a;
        a = f.C("A", {href:a, target:"_blank"}, f.C("IMG", {src:a}));
        yf(d, Kb("", null));
        d.Ha().appendChild(a);
        sf(d);
      }
    }).Na(function(a) {
      b.j.Y(!1);
      aj(b, "Unable to take screenshot.", a);
    });
  } else {
    ed(this.b, "Cannot take screenshot; no session selected!");
  }
};
function bj(a) {
  this.a = a;
  this.b = {};
  this.c = qc("webdriver.http.Executor");
}
function $i(a, b) {
  var c = a.b[b.a] || cj[b.a];
  if (!c) {
    throw Error("Unrecognized command: " + b.a);
  }
  var d = b.b, f = dj(c.path, d), g = new ej(c.method, f, d), h = a.c;
  mc(h, function() {
    return ">>>\n" + g;
  });
  return fj(a.a, g).then(function(a) {
    mc(h, function() {
      return "<<<\n" + a;
    });
    return gj(a);
  });
}
function dj(a, b) {
  var c = a.match(/\/:(\w+)\b/g);
  if (c) {
    for (var d = 0;d < c.length;++d) {
      var f = c[d].substring(2);
      if (f in b) {
        var g = b[f];
        g && g.ELEMENT && (g = g.ELEMENT);
        a = a.replace(c[d], "/" + g);
        delete b[f];
      } else {
        throw Error("Missing required parameter: " + f);
      }
    }
  }
  return a;
}
function gj(a) {
  try {
    return JSON.parse(a.a);
  } catch (b) {
  }
  var c = {status:0, value:a.a.replace(/\r\n/g, "\n")};
  199 < a.status && 300 > a.status || (c.status = 404 == a.status ? 9 : 13);
  return c;
}
var cj = function() {
  function a(a) {
    return c("POST", a);
  }
  function b(a) {
    return c("GET", a);
  }
  function c(a, b) {
    return {method:a, path:b};
  }
  return (new function() {
    var a = {};
    this.put = function(b, c) {
      a[b] = c;
      return this;
    };
    this.bd = function() {
      return a;
    };
  }).put("getStatus", b("/status")).put("newSession", a("/session")).put("getSessions", b("/sessions")).put("getSessionCapabilities", b("/session/:sessionId")).put("quit", c("DELETE", "/session/:sessionId")).put("close", c("DELETE", "/session/:sessionId/window")).put("getCurrentWindowHandle", b("/session/:sessionId/window_handle")).put("getWindowHandles", b("/session/:sessionId/window_handles")).put("getCurrentUrl", b("/session/:sessionId/url")).put("get", a("/session/:sessionId/url")).put("goBack", 
  a("/session/:sessionId/back")).put("goForward", a("/session/:sessionId/forward")).put("refresh", a("/session/:sessionId/refresh")).put("addCookie", a("/session/:sessionId/cookie")).put("getCookies", b("/session/:sessionId/cookie")).put("deleteAllCookies", c("DELETE", "/session/:sessionId/cookie")).put("deleteCookie", c("DELETE", "/session/:sessionId/cookie/:name")).put("findElement", a("/session/:sessionId/element")).put("findElements", a("/session/:sessionId/elements")).put("getActiveElement", 
  a("/session/:sessionId/element/active")).put("findChildElement", a("/session/:sessionId/element/:id/element")).put("findChildElements", a("/session/:sessionId/element/:id/elements")).put("clearElement", a("/session/:sessionId/element/:id/clear")).put("clickElement", a("/session/:sessionId/element/:id/click")).put("sendKeysToElement", a("/session/:sessionId/element/:id/value")).put("submitElement", a("/session/:sessionId/element/:id/submit")).put("getElementText", b("/session/:sessionId/element/:id/text")).put("getElementTagName", 
  b("/session/:sessionId/element/:id/name")).put("isElementSelected", b("/session/:sessionId/element/:id/selected")).put("isElementEnabled", b("/session/:sessionId/element/:id/enabled")).put("isElementDisplayed", b("/session/:sessionId/element/:id/displayed")).put("getElementLocation", b("/session/:sessionId/element/:id/location")).put("getElementSize", b("/session/:sessionId/element/:id/size")).put("getElementAttribute", b("/session/:sessionId/element/:id/attribute/:name")).put("getElementValueOfCssProperty", 
  b("/session/:sessionId/element/:id/css/:propertyName")).put("elementEquals", b("/session/:sessionId/element/:id/equals/:other")).put("takeElementScreenshot", b("/session/:sessionId/element/:id/screenshot")).put("switchToWindow", a("/session/:sessionId/window")).put("maximizeWindow", a("/session/:sessionId/window/:windowHandle/maximize")).put("getWindowPosition", b("/session/:sessionId/window/:windowHandle/position")).put("setWindowPosition", a("/session/:sessionId/window/:windowHandle/position")).put("getWindowSize", 
  b("/session/:sessionId/window/:windowHandle/size")).put("setWindowSize", a("/session/:sessionId/window/:windowHandle/size")).put("switchToFrame", a("/session/:sessionId/frame")).put("getPageSource", b("/session/:sessionId/source")).put("getTitle", b("/session/:sessionId/title")).put("executeScript", a("/session/:sessionId/execute")).put("executeAsyncScript", a("/session/:sessionId/execute_async")).put("screenshot", b("/session/:sessionId/screenshot")).put("setTimeout", a("/session/:sessionId/timeouts")).put("setScriptTimeout", 
  a("/session/:sessionId/timeouts/async_script")).put("implicitlyWait", a("/session/:sessionId/timeouts/implicit_wait")).put("mouseMoveTo", a("/session/:sessionId/moveto")).put("mouseClick", a("/session/:sessionId/click")).put("mouseDoubleClick", a("/session/:sessionId/doubleclick")).put("mouseButtonDown", a("/session/:sessionId/buttondown")).put("mouseButtonUp", a("/session/:sessionId/buttonup")).put("mouseMoveTo", a("/session/:sessionId/moveto")).put("sendKeysToActiveElement", a("/session/:sessionId/keys")).put("touchSingleTap", 
  a("/session/:sessionId/touch/click")).put("touchDoubleTap", a("/session/:sessionId/touch/doubleclick")).put("touchDown", a("/session/:sessionId/touch/down")).put("touchUp", a("/session/:sessionId/touch/up")).put("touchMove", a("/session/:sessionId/touch/move")).put("touchScroll", a("/session/:sessionId/touch/scroll")).put("touchLongPress", a("/session/:sessionId/touch/longclick")).put("touchFlick", a("/session/:sessionId/touch/flick")).put("acceptAlert", a("/session/:sessionId/accept_alert")).put("dismissAlert", 
  a("/session/:sessionId/dismiss_alert")).put("getAlertText", b("/session/:sessionId/alert_text")).put("setAlertValue", a("/session/:sessionId/alert_text")).put("getLog", a("/session/:sessionId/log")).put("getAvailableLogTypes", b("/session/:sessionId/log/types")).put("getSessionLogs", a("/logs")).put("uploadFile", a("/session/:sessionId/file")).bd();
}();
function hj(a) {
  var b = [], c;
  for (c in a) {
    b.push(c + ": " + a[c]);
  }
  return b.join("\n");
}
function ej(a, b, c) {
  this.method = a;
  this.path = b;
  this.data = c || {};
  this.a = {Accept:"application/json; charset=utf-8"};
}
ej.prototype.toString = function() {
  return [this.method + " " + this.path + " HTTP/1.1", hj(this.a), "", JSON.stringify(this.data)].join("\n");
};
function ij(a, b, c) {
  this.status = a;
  this.a = c;
  this.b = {};
  for (var d in b) {
    this.b[d.toLowerCase()] = b[d];
  }
}
function jj(a) {
  var b = {};
  if (a.getAllResponseHeaders) {
    var c = a.getAllResponseHeaders();
    c && (c = c.replace(/\r\n/g, "\n").split("\n"), B(c, function(a) {
      a = a.split(/\s*:\s*/, 2);
      a[0] && (b[a[0]] = a[1] || "");
    }));
  }
  return new ij(a.status || 200, b, a.responseText.replace(/\0/g, ""));
}
ij.prototype.toString = function() {
  var a = hj(this.b), b = ["HTTP/1.1 " + this.status, a];
  a && b.push("");
  this.a && b.push(this.a);
  return b.join("\n");
};
function kj() {
}
;var lj;
function mj() {
}
w(mj, kj);
function nj() {
  var a;
  a: {
    var b = lj;
    if (!b.a && "undefined" == typeof XMLHttpRequest && "undefined" != typeof ActiveXObject) {
      for (var c = ["MSXML2.XMLHTTP.6.0", "MSXML2.XMLHTTP.3.0", "MSXML2.XMLHTTP", "Microsoft.XMLHTTP"], d = 0;d < c.length;d++) {
        var f = c[d];
        try {
          new ActiveXObject(f);
          a = b.a = f;
          break a;
        } catch (g) {
        }
      }
      throw Error("Could not create ActiveXObject. ActiveX might be disabled, or MSXML might not be installed");
    }
    a = b.a;
  }
  return a ? new ActiveXObject(a) : new XMLHttpRequest;
}
lj = new mj;
function oj(a) {
  this.a = a;
}
function fj(a, b) {
  var c = a.a + b.path;
  return new si(function(a, f) {
    var g = nj();
    g.open(b.method, c, !0);
    g.onload = function() {
      a(jj(g));
    };
    g.onerror = function() {
      f(Error(["Unable to send request: ", b.method, " ", c, "\nOriginal request:\n", b].join("")));
    };
    for (var h in b.a) {
      g.setRequestHeader(h, b.a[h] + "");
    }
    g.send(JSON.stringify(b.data));
  });
}
;function pj() {
  var a = window.location, a = [a.protocol, "//", a.host, a.pathname.replace(/\/static\/resource(?:\/[^\/]*)?$/, "")].join(""), b = new bj(new oj(a));
  Xi(new Vi(a, b));
}
var qj = ["init"], rj = m;
qj[0] in rj || !rj.execScript || rj.execScript("var " + qj[0]);
for (var sj;qj.length && (sj = qj.shift());) {
  !qj.length && n(pj) ? rj[sj] = pj : rj[sj] ? rj = rj[sj] : rj = rj[sj] = {};
}
;
