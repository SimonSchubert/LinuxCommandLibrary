# TAGLINE

Generate beautiful images of source code

# TLDR

**Create code image from file**

```carbon-now [file.js]```

**Create image from clipboard**

```carbon-now --from-clipboard```

**Create image with specific theme**

```carbon-now [file.js] -t [dracula]```

**Create image and copy to clipboard**

```carbon-now [file.js] --to-clipboard```

**Create image with specific language**

```carbon-now [file.js] -l [python]```

**Specify output location**

```carbon-now [file.js] -h [~/Pictures]```

**Open in browser instead of saving**

```carbon-now [file.js] --open```

**Create image from stdin**

```echo "const x = 1;" | carbon-now --from-clipboard```

# SYNOPSIS

**carbon-now** [_options_] [_file_]

# PARAMETERS

**-t**, **--theme** _name_
> Color theme (dracula, monokai, night-owl, etc.).

**-l**, **--language** _lang_
> Programming language for syntax highlighting.

**-b**, **--background** _color_
> Background color (hex or rgba).

**-p**, **--preset** _name_
> Use a saved preset configuration.

**--from-clipboard**
> Use code from clipboard.

**--to-clipboard**
> Copy resulting image to clipboard.

**-h**, **--save-to** _path_
> Directory to save the image.

**--open**
> Open in browser instead of saving.

**-s**, **--start** _line_
> Start line number.

**-e**, **--end** _line_
> End line number.

**--config** _file_
> Custom configuration file.

# DESCRIPTION

**carbon-now-cli** generates beautiful images of source code using the Carbon service. It creates shareable code snippets with syntax highlighting, customizable themes, and export options - ideal for presentations, documentation, and social media.

The tool interfaces with Carbon (carbon.now.sh), a web service for creating and sharing code images. The CLI provides automation and batch processing capabilities beyond what the web interface offers.

Output images feature proper syntax highlighting, configurable fonts, padding, and backgrounds. Presets allow saving frequently used configurations for consistent styling across projects.

# CAVEATS

Requires internet connectivity to reach the Carbon service. Large code blocks may be truncated or render poorly. The service may have rate limits or availability issues. Image generation depends on external service availability. Some advanced Carbon features may not be exposed via CLI.

# HISTORY

Carbon was created by **Dawn Labs** and launched in **2017** as a web application for creating beautiful code images. The carbon-now-cli was developed as a community project to provide command-line access to the service. It became popular among developers for quickly generating code images for documentation, tweets, and presentations without opening a browser.

# SEE ALSO

[silicon](/man/silicon)(1), [pygmentize](/man/pygmentize)(1), [highlight](/man/highlight)(1)
