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

**slimrb** compiles Slim templates. It generates HTML.

Slim is minimalist. Clean template syntax.

Ruby templating. ERB alternative.

Pretty printing available. Readable output.

Rails integration. Framework support.

# CAVEATS

Ruby required. Slim gem needed. Ruby-specific templating.

# HISTORY

**slimrb** is the CLI compiler for **Slim**, a fast and lightweight Ruby templating engine.

# SEE ALSO

[erb](/man/erb)(1), [haml](/man/haml)(1), [ruby](/man/ruby)(1)
