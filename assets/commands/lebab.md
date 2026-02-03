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

**--replace**
> Modify files in place.

# DESCRIPTION

**lebab** converts JavaScript code from ES5 to ES6/ES2015+. Automatically applies transformations like arrow functions, let/const, template strings, and destructuring. The reverse of Babel - modernizes legacy JavaScript code.

# SEE ALSO

[babel](/man/babel)(1), [eslint](/man/eslint)(1)

