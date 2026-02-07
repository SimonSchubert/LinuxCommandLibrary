# TAGLINE

convert CoffeeScript to modern JavaScript

# TLDR

**Convert CoffeeScript to JavaScript**

```decaffeinate [file.coffee]```

**Convert to modern JavaScript**

```decaffeinate --use-cs2 [file.coffee]```

**Output to specific file**

```decaffeinate [file.coffee] -o [output.js]```

**Convert directory**

```decaffeinate [src/]```

# SYNOPSIS

**decaffeinate** [_options_] _files..._

# PARAMETERS

**-o**, **--output** _file_
> Output file path.

**--use-cs2**
> Use CoffeeScript 2 compatibility.

**--disable-babel-constructor-workaround**
> Disable Babel class workaround.

**--loose**
> Enable loose mode for simpler output.

# DESCRIPTION

**decaffeinate** converts CoffeeScript to modern JavaScript (ES6+). It produces idiomatic JavaScript with proper class syntax, arrow functions, template literals, and destructuring.

Useful for migrating CoffeeScript codebases to JavaScript.

# CAVEATS

Some CoffeeScript patterns may require manual cleanup. Review generated code for edge cases.

# SEE ALSO

[coffee](/man/coffee)(1), [babel](/man/babel)(1)
