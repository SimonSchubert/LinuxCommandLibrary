# TAGLINE

convert CoffeeScript to modern JavaScript

# TLDR

**Convert a CoffeeScript file to JavaScript**

```decaffeinate [file.coffee]```

**Convert using CoffeeScript 2 compatibility**

```decaffeinate --use-cs2 [file.coffee]```

**Convert and use ES module syntax (import/export)**

```decaffeinate --use-js-modules [file.coffee]```

**Write output to a specific file**

```decaffeinate -o [output.js] [file.coffee]```

**Convert multiple files at once**

```decaffeinate [file1.coffee] [file2.coffee]```

**Use loose mode for simpler output**

```decaffeinate --loose [file.coffee]```

# SYNOPSIS

**decaffeinate** [_options_] _files..._

# PARAMETERS

**-o**, **--output** _file_
> Write output to the specified file path.

**--use-cs2**
> Treat input as CoffeeScript 2 code (default assumes CoffeeScript 1).

**--use-js-modules**
> Convert `require`/`module.exports` to ES6 `import`/`export` syntax.

**--modernize-js**
> Treat the input as JavaScript and apply only JS-to-JS transforms (no CoffeeScript conversion).

**--literate**
> Treat input as Literate CoffeeScript.

**--loose**
> Enable all loose transformation options for simpler output (may have minor semantic differences).

**--prefer-let**
> Use `let` instead of `const` for most variables in the output.

**--disable-suggestion-comment**
> Omit the followup suggestions comment at the top of the output file.

**--optional-chaining**
> Use JavaScript optional chaining (`?.`) in generated output.

**--nullish-coalescing**
> Use the nullish coalescing operator (`??`) in generated output.

**--logical-assignment**
> Use ES2021 logical assignment operators (`&&=`, `||=`, `??=`).

**--disable-babel-constructor-workaround**
> Disable Babel class constructor workaround.

# DESCRIPTION

**decaffeinate** converts CoffeeScript to modern JavaScript (ES6+). It produces idiomatic JavaScript with proper class syntax, arrow functions, template literals, and destructuring.

Useful for migrating CoffeeScript codebases to JavaScript.

# CAVEATS

Some CoffeeScript patterns may require manual cleanup. Review generated code for edge cases.

# SEE ALSO

[coffee](/man/coffee)(1), [babel](/man/babel)(1)
