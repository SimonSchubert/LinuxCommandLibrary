# TAGLINE

Compile Slim templates to HTML

# TLDR

**Compile Slim to HTML**

```slimrb [template.slim]```

**Compile to file**

```slimrb [template.slim] [output.html]```

**Pretty output**

```slimrb -p [template.slim]```

**Generate Rails-compatible Ruby code**

```slimrb --rails [template.slim]```

**Convert to ERB**

```slimrb -e [template.slim]```

**Load the logic-less plugin**

```slimrb -r slim/logic_less [template.slim]```

**Pass local variables**

```slimrb -l '{name: "[World]"}' [template.slim]```

**Compile from stdin**

```echo "[h1 Hello]" | slimrb```

# SYNOPSIS

**slimrb** [_options_] [_input_] [_output_]

# PARAMETERS

**-s**, **--stdin**
> Read input from standard input instead of a file.

**-c**, **--compile**
> Compile only, printing Ruby code without running it.

**-e**, **--erb**
> Convert to ERB.

**--rails**
> Generate Rails-compatible code; implies **--compile**.

**-r**, **--require** _library_
> Load a library or plugin, such as **slim/logic_less** or **slim/translator**.

**-p**, **--pretty**
> Produce pretty HTML.

**-o**, **--option** _name=code_
> Set a Slim option.

**-l**, **--locals** _Hash|YAML|JSON_
> Set local variables.

**--trace**
> Show a full traceback on error.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Print the version.

# DESCRIPTION

**slimrb** is the command-line compiler for the Slim template language, a lightweight Ruby templating engine that reduces HTML markup to its essential parts. It reads Slim files and renders them to HTML, ERB, or raw Ruby code for inspection and debugging.

Slim uses indentation-based nesting and eliminates closing tags, producing templates that are significantly shorter than equivalent HTML or ERB. The compiler supports pretty-printed output for debugging, Rails-compatible code generation, and conversion to ERB format for use in contexts that don't support Slim directly.

The tool integrates with Ruby's Tilt template interface and works with Rails, Sinatra, and other Rack-based frameworks. Plugins can extend the syntax with logic-less templates, translation support, and other features.

# CAVEATS

Ruby required. Slim gem needed. Ruby-specific templating.

# HISTORY

**slimrb** is the CLI compiler for **Slim**, a fast and lightweight Ruby templating engine.

# SEE ALSO

[erb](/man/erb)(1), [haml](/man/haml)(1), [ruby](/man/ruby)(1)

# RESOURCES

```[Source code](https://github.com/slim-template/slim)```

```[Homepage](https://slim-template.github.io/)```

<!-- verified: 2026-11-08 -->
