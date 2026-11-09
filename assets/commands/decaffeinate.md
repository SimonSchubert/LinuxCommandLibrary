# TAGLINE

convert CoffeeScript to modern JavaScript

# TLDR

**Convert a CoffeeScript file to JavaScript**

```decaffeinate [file.coffee]```

**Convert using CoffeeScript 2 compatibility**

```decaffeinate --use-cs2 [file.coffee]```

**Convert and use ES module syntax (import/export)**

```decaffeinate --use-js-modules [file.coffee]```

**Convert every CoffeeScript file in a directory**

```decaffeinate [src/]```

**Read from stdin** and write to stdout

```decaffeinate < [file.coffee]```

**Convert multiple files at once**

```decaffeinate [file1.coffee] [file2.coffee]```

**Use loose mode for simpler output**

```decaffeinate --loose [file.coffee]```

# SYNOPSIS

**decaffeinate** [_options_] _path_...

**decaffeinate** [_options_] < _input_

# PARAMETERS

**--use-cs2**
> Treat input as CoffeeScript 2 code (default assumes CoffeeScript 1).

**--use-js-modules**
> Convert `require`/`module.exports` to ES6 `import`/`export` syntax.

**--loose-js-modules**
> Allow named exports when converting to JS modules.

**--safe-import-function-identifiers** _names_
> Comma-separated function names that may appear in the import section without disqualifying later requires.

**--modernize-js**
> Treat the input as JavaScript and apply only JS-to-JS transforms (no CoffeeScript conversion).

**--literate**
> Treat input as Literate CoffeeScript.

**--loose**
> Enable all **--loose-...** options for simpler output (may have minor semantic differences).

**--loose-default-params**
> Convert CoffeeScript default params to JS default params.

**--loose-for-expressions**
> Do not wrap expression loop targets in `Array.from`.

**--loose-for-of**
> Do not wrap JS `for...of` loop targets in `Array.from`.

**--loose-includes**
> Do not wrap in `Array.from` when converting `in` to `includes`.

**--loose-comparison-negation**
> Allow unsafe simplifications like `!(a > b)` to `a <= b`.

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

**--no-array-includes**
> Do not use `Array.prototype.includes` in generated code.

**--disallow-invalid-constructors**
> Give an error when constructors use `this` before `super` or omit the `super` call in a subclass.

**-h**, **--help**
> Display help.

**-v**, **--version**
> Display the version.

# DESCRIPTION

**decaffeinate** converts CoffeeScript to modern JavaScript (ES6+). It produces idiomatic JavaScript with proper class syntax, arrow functions, template literals, and destructuring.

Useful for migrating CoffeeScript codebases to JavaScript.

# CAVEATS

Some CoffeeScript patterns may require manual cleanup. Review generated code for edge cases. Each input file is written to a **.js** file next to it; there is no output path option. With **--modernize-js**, files are changed in place. Without paths, input is read from stdin and output goes to stdout.

# SEE ALSO

[coffee](/man/coffee)(1), [babel](/man/babel)(1)

# RESOURCES

```[Source code](https://github.com/decaffeinate/decaffeinate)```

```[Homepage](https://decaffeinate-project.org/)```

<!-- verified: 2026-11-09 -->
