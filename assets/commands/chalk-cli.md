# TLDR

**Style text with color**

```chalk red "Hello World"```

**Apply multiple styles**

```chalk red bold "Important text"```

**Use template syntax**

```chalk -t "{red.bold Unicorns} are {blue fun}"```

**Read from stdin**

```echo "text" | chalk --stdin green```

**Negate a style in template**

```chalk -t "{red text {~red normal}}"```

**Output without newline**

```chalk -n yellow "No newline"```

**Demo all styles**

```chalk --demo```

# SYNOPSIS

**chalk** [_options_] _style_... _string_

**echo** _string_ **| chalk** **--stdin** _style_...

# DESCRIPTION

**chalk-cli** is a command-line tool for styling terminal strings with colors and formatting. It provides an easy way to add visual styling to command output using the Chalk library.

# PARAMETERS

**-t**, **--template**
> Use template syntax for nested styles

**--stdin**
> Read input from stdin

**-n**, **--no-newline**
> Don't emit newline after output

**--demo**
> Show demo of all available styles

**-c**, **--color**
> Force color support

# STYLES

**Colors**
> black, red, green, yellow, blue, magenta, cyan, white, gray

**Bright colors**
> redBright, greenBright, yellowBright, etc.

**Background**
> bgRed, bgGreen, bgBlue, etc.

**Modifiers**
> bold, dim, italic, underline, inverse, strikethrough

# TEMPLATE SYNTAX

Templates allow inline nested styling:

```
{red.bold text}
{red red {~red normal}}  # ~ negates style
```

# INSTALLATION

```npm install --global chalk-cli```

# CAVEATS

Requires Node.js. Color support depends on terminal capabilities. Use --color to force colors in pipes.

# SEE ALSO

[tput](/man/tput)(1), [printf](/man/printf)(1)
