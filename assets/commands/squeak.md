# TAGLINE

Open-source Smalltalk virtual machine

# TLDR

**Start Squeak** with default image

```squeak```

**Run a specific image file**

```squeak [path/to/image.image]```

**Run in headless mode** (no GUI)

```squeak -headless [image.image]```

**Run with a specific memory size**

```squeak -memory [512m] [image.image]```

**Run with a specific sources file**

```squeak -pathenc utf8 [image.image]```

**Run with VM options**

```squeak -vm-sound-null [image.image]```

# SYNOPSIS

**squeak** [_vm-options_] [_image_] [_script-arguments_]

# PARAMETERS

**-headless**
> Run without a graphical display. Useful for servers and CI environments.

**-memory** _size_
> Set initial memory size (e.g., 256m, 1g).

**-vm-sound-null**
> Disable sound output.

**-vm-display-null**
> Use null display driver.

**-encoding** _enc_
> Set character encoding for file operations.

**-pathenc** _enc_
> Set path encoding (utf8, latin1).

**-plugins** _path_
> Directory containing VM plugins.

**-version**
> Display VM version information.

**-help**
> Display help information.

# ENVIRONMENT

**SQUEAK_IMAGE**
> Default image file to use if none specified on command line.

**SQUEAK_PLUGINS**
> Directory containing VM plugins.

# DESCRIPTION

**squeak** is the virtual machine launcher for Squeak, an open-source Smalltalk programming environment. It executes Squeak image files, which contain the complete state of a Smalltalk system including all objects, classes, and the development environment.

The VM provides a portable execution environment across platforms. When started without arguments, it looks for images in **~/squeak** and **/usr/share/squeak**, or uses the image specified in the **SQUEAK_IMAGE** environment variable.

Squeak includes a complete IDE with code browser, debugger, and GUI toolkit. The headless mode enables running Squeak applications as servers or in CI pipelines without graphical output. CommandShell provides Unix shell integration within the Squeak environment.

# CAVEATS

On 64-bit Linux systems, running 32-bit Squeak images requires 32-bit compatibility libraries. X11 must be installed for graphical mode. Image files are not portable between significantly different VM versions. Memory settings may need adjustment for large projects.

# HISTORY

**Squeak** was created at Apple in **1996** by Alan Kay, Dan Ingalls, and others as an open-source implementation of Smalltalk-80. The name comes from the mouse mascot. It evolved from the original Xerox PARC Smalltalk and has been continuously developed by an international community. Squeak has spawned derivative projects including Pharo and serves as a platform for educational programming tools like Scratch (its original implementation).

# SEE ALSO

[pharo](/man/pharo)(1), [gst](/man/gst)(1), [smalltalkci](/man/smalltalkci)(1)
