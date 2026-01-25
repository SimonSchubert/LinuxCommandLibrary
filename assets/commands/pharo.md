# TLDR

**Launch Pharo image**

```pharo [image.image]```

**Run headless**

```pharo --headless [image.image] [script.st]```

**Evaluate expression**

```pharo [image.image] eval "[expression]"```

**Start with GUI**

```pharo-ui [image.image]```

# SYNOPSIS

**pharo** [_options_] _image_ [_arguments_]

# PARAMETERS

**--headless**
> Run without GUI.

**--no-quit**
> Don't quit after script.

**eval**
> Evaluate Smalltalk expression.

**--version**
> Show version.

**image**
> Pharo image file.

# DESCRIPTION

**pharo** is the launcher for Pharo Smalltalk, a modern, open-source Smalltalk environment. Pharo uses image-based persistence where the entire environment state is saved.

# EXAMPLES

```bash
# Launch GUI
pharo-ui Pharo.image

# Run script headless
pharo --headless Pharo.image script.st

# Evaluate and print
pharo Pharo.image eval "3 + 4"

# Save and quit
pharo Pharo.image eval "Smalltalk snapshot: true andQuit: true"

# Run tests
pharo --headless Pharo.image test MyPackage
```

# IMAGE MANAGEMENT

```bash
# Download fresh image
curl https://get.pharo.org/64/ | bash

# Create clean image
pharo Pharo.image save MyProject
```

# CAVEATS

Requires Pharo VM and image. Image files are platform-specific. Changes persist in image.

# HISTORY

Pharo forked from **Squeak** Smalltalk in 2008, focusing on clean, innovative Smalltalk development.

# SEE ALSO

[squeak](/man/squeak)(1), [gst](/man/gst)(1), [smalltalk](/man/smalltalk)(1)
