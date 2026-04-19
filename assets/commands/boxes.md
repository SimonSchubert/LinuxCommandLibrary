# TAGLINE

Draw ASCII art boxes around text.

# TLDR

**Create** box around text

```echo ["Hello World"] | boxes```

**Specific** design

```echo ["Text"] | boxes -d [stone]```

**List** available designs

```boxes -l```

**Remove** box

```cat [boxed.txt] | boxes -r```

# SYNOPSIS

**boxes** [_options_] [_file_]

# DESCRIPTION

**boxes** is a text filter that draws ASCII art boxes around text. It supports numerous box designs and can both add and remove boxes, making it useful for creating eye-catching comments, headers, or decorative text in source code and documentation.

The tool provides over 50 predefined box styles with customization options.

# PARAMETERS

**-d** _design_
> Box design to use.

**-l**
> List available designs with samples.

**-r**
> Remove an existing box (design auto-detected; combine with -d to hint).

**-a** _format_
> Alignment/positioning of text inside box (e.g., `hcvc` for horizontally and vertically centered).

**-s** _WxH_
> Desired box size in columns (width) and lines (height).

**-p** _format_
> Padding around input (e.g., `a1l3` = 1 space all around plus 3 extra on the left).

**-f** _file_
> Use alternate config file.

**-i** _indent_
> Indentation mode for input (`box`, `text`, or `none`).

**-n** _encoding_
> Input/output character encoding.

**-t** _tabopts_
> Tab handling options (expand/keep/unexpand).

**-k** _bool_
> Leading/trailing blank lines in input handling.

**-e** _eol_
> Force end-of-line style (`unix`, `dos`, `mac`).

**-c** _string_
> Shortcut to create a basic box with the given character(s) as border.

**-h**
> Print usage information.

**-v**
> Print version information.

# POPULAR DESIGNS

- **stone** - Stone wall style
- **dog** - ASCII dog
- **cat** - ASCII cat
- **parchment** - Scroll/parchment
- **spring** - Spring/coil
- **santa** - Santa Claus
- **c-cmt** - C comment block
- **java-cmt** - Java comment block

# WORKFLOW

```bash
# Simple box
echo "Hello" | boxes

# Specific design
echo "Warning" | boxes -d stone

# List all designs
boxes -l

# Remove box
cat file.txt | boxes -r

# Custom alignment
echo "Centered" | boxes -a c
```

# CAVEATS

Wide text may not fit terminal. Some designs require monospace font. Configuration file syntax complex for custom designs. Removing boxes not perfect for modified boxes.

# HISTORY

**boxes** was created by Thomas Jensen in **1999** to provide decorative ASCII boxes for text, inspired by similar DOS utilities.

# SEE ALSO

[figlet](/man/figlet)(6), [cowsay](/man/cowsay)(1), [banner](/man/banner)(6)
