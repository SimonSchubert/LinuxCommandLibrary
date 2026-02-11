# TAGLINE

Compile Slim templates to HTML

# TLDR

**Compile Slim to HTML**

```slimrb [template.slim]```

**Compile to file**

```slimrb [template.slim] [output.html]```

**Pretty output**

```slimrb -p [template.slim]```

**With Rails support**

```slimrb -r [template.slim]```

**Compile from stdin**

```echo "[h1 Hello]" | slimrb```

# SYNOPSIS

**slimrb** [_-p_] [_-r_] [_options_] [_input_] [_output_]

# PARAMETERS

**-p**, **--pretty**
> Pretty print HTML.

**-r**, **--rails**
> Rails mode.

**-e**, **--erb**
> Convert from ERB.

**-l**, **--logic-less**
> Logic-less mode.

**-t**, **--translator**
> Translation mode.

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
