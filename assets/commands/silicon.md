# TLDR

**Generate code image from file**

```silicon [source.rs] -o [code.png]```

**Generate from clipboard**

```silicon --from-clipboard -o [code.png]```

**Specify language**

```silicon --language [python] -o [code.png] < [code.py]```

**Use specific theme**

```silicon --theme [Dracula] [source.rs] -o [code.png]```

**Add line numbers**

```silicon --line-number [source.rs] -o [code.png]```

**Custom background color**

```silicon --background ["#1e1e2e"] [source.rs] -o [code.png]```

**Add shadow**

```silicon --shadow-blur-radius [10] [source.rs] -o [code.png]```

**List available themes**

```silicon --list-themes```

# SYNOPSIS

**silicon** [_--language lang_] [_--theme name_] [_--output file_] [_options_] [_file_]

# PARAMETERS

**-o** _FILE_, **--output** _FILE_
> Output image file.

**-l** _LANG_, **--language** _LANG_
> Source language for highlighting.

**--theme** _NAME_
> Color theme.

**--list-themes**
> Show available themes.

**--list-fonts**
> Show available fonts.

**--from-clipboard**
> Read code from clipboard.

**--to-clipboard**
> Write image to clipboard.

**-f** _FONT_, **--font** _FONT_
> Font name.

**--line-number**
> Show line numbers.

**--line-offset** _NUM_
> Start line number.

**--highlight-lines** _RANGE_
> Highlight specific lines.

**--background** _COLOR_
> Background color.

**--shadow-blur-radius** _PX_
> Shadow blur radius.

**--shadow-offset-x** _PX_
> Shadow X offset.

**--shadow-offset-y** _PX_
> Shadow Y offset.

**--pad-horiz** _PX_
> Horizontal padding.

**--pad-vert** _PX_
> Vertical padding.

**--no-round-corner**
> Disable rounded corners.

**--no-window-controls**
> Hide window buttons.

# DESCRIPTION

**silicon** creates beautiful images of source code. It applies syntax highlighting, window chrome, and styling to produce images suitable for documentation, presentations, and social media.

Languages are auto-detected from file extension or specified explicitly. The tool uses syntect for highlighting, supporting most programming languages. Themes from popular editors (VS Code, Sublime) are included.

Output resembles a terminal or editor window. Window controls (traffic light buttons on macOS style) add realism. Shadows create depth. Rounded corners give a modern look.

Line numbers and line highlighting help explain specific code sections. Custom fonts ensure readable output with proper monospace alignment.

Clipboard integration enables quick workflows: copy code, run silicon, paste image. This streamlines creating code screenshots.

Padding, colors, and shadows are all customizable for matching brand guidelines or presentation themes.

# CAVEATS

Very long lines may produce wide images. Not all terminal themes available. Font must be installed for custom fonts. Large code blocks create large images. PNG output only (no SVG). Line highlight syntax can be tricky.

# HISTORY

**silicon** was created by **Aloxaf** around **2019** as a Rust alternative to carbon-now-cli. Written in Rust, it provides offline code image generation. The name references silicon wafers and chips, alluding to code becoming "hardware." It's popular in developer communities for sharing code snippets.

# SEE ALSO

[carbon-now-cli](/man/carbon-now-cli)(1), [pygmentize](/man/pygmentize)(1), [bat](/man/bat)(1)
