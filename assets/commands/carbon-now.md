# TAGLINE

Generate beautiful images of source code

# TLDR

**Generate image from file**

```carbon-now [file.js]```

**Interactive mode**

```carbon-now [file.py] --interactive```

**Save to specific location**

```carbon-now [file.rs] --save-to [~/images]```

**Save with custom name**

```carbon-now [file.go] --save-as [my-code]```

**From clipboard**

```carbon-now --from-clipboard```

**Copy result to clipboard**

```carbon-now [file.ts] --to-clipboard```

**Use preset**

```carbon-now [file.js] --preset [my-preset]```

**Specific line range**

```carbon-now [file.py] --start [5] --end [15]```

# SYNOPSIS

**carbon-now** _file_ [_options_]
**carbon-now** --from-clipboard [_options_]

# DESCRIPTION

**carbon-now** creates beautiful images of source code from the terminal using the Carbon service (carbon.now.sh). It renders code with syntax highlighting, customizable themes, and professional styling suitable for presentations, documentation, and social media.

The tool uses a headless browser (Playwright) to render images through the Carbon web service. It supports reading from files, clipboard, or stdin, and can output to files or clipboard. Interactive mode allows customizing appearance settings before generating the image. Presets save frequently used configurations for consistent styling.

# PARAMETERS

**-i**, **--interactive**
> Customize settings before generating

**-s**, **--start** _line_
> Starting line of input

**-e**, **--end** _line_
> Ending line of input

**-p**, **--preset** _name_
> Apply existing preset

**--save-to** _path_
> Image save location (default: cwd)

**--save-as** _name_
> Image filename without extension

**--from-clipboard**
> Read input from clipboard

**--to-clipboard**
> Copy image to clipboard

**--open-in-browser**
> Open in browser instead of saving

**--config** _path_
> Use different config file

**--settings** _json_
> Override specific settings

**--disable-headless**
> Run browser in headful mode

**--engine** _name_
> Rendering engine (default: chromium)

# CONFIGURATION

**~/.carbon-now.json**
> Saved settings and presets. Previous settings are reused automatically.

# CAVEATS

Requires Node.js and npm. Uses headless browser (Playwright) for rendering. Internet connection required for Carbon service.

# SEE ALSO

[silicon](/man/silicon)(1), [freeze](/man/freeze)(1)
