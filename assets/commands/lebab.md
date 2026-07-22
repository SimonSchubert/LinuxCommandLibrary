# TAGLINE

converts JavaScript code from ES5 to ES6/ES2015+

# TLDR

**Convert ES5 to ES6**

```lebab [input.js] -o [output.js]```

**Apply specific transforms**

```lebab [input.js] -o [output.js] --transform arrow,let```

**Convert in place**

```lebab --replace [file.js] --transform arrow```

**List available transforms**

```lebab --help```

# SYNOPSIS

**lebab** [_options_] _file_

# PARAMETERS

**-o**, **--out-file** _file_
> Output file path.

**-t**, **--transform** _transforms_
> Comma-separated list of transforms.

**-r**, **--replace** _glob_
> Transform files in place, matching a file or glob pattern.

# TRANSFORMS

Safe transforms apply with high confidence: **arrow**, **arrow-return**, **for-of**, **for-each**, **arg-rest**, **arg-spread**, **obj-method**, **obj-shorthand**, **no-strict**, **exponent**, **multi-var**.

Unsafe transforms rely on heuristics and should be applied one at a time with careful review: **let**, **class**, **commonjs**, **template**, **default-param**, **destruct-param**, **includes**.

# DESCRIPTION

**lebab** converts JavaScript code from ES5 to ES6/ES2015+. It applies transformations like arrow functions, let/const, template strings, and destructuring. The reverse of Babel, it modernizes legacy JavaScript code.

No transform runs by default: at least one must be selected with **--transform**. The recommended workflow is to apply a single transform at a time and inspect the diff, since combining many transforms in one pass can produce broken code.

# INSTALL

```aur: yay -S lebab```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[babel](/man/babel)(1), [eslint](/man/eslint)(1)

