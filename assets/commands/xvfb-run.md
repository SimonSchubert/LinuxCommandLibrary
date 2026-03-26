# TAGLINE

Run commands in virtual X server

# TLDR

**Run a command in a virtual X server**

```xvfb-run [command]```

**Auto-select a free server number**

```xvfb-run -a [command]```

**Pass server arguments for screen resolution and depth**

```xvfb-run -s "-screen 0 1024x768x24" [command]```

**Log Xvfb errors to a file**

```xvfb-run -e [/tmp/xvfb.log] [command]```

**Use a specific server number**

```xvfb-run -n [44] [command]```

# SYNOPSIS

**xvfb-run** [_OPTIONS_] _COMMAND_

# PARAMETERS

**-a, --auto-servernum**
> Try to get a free server number, starting at 99 or the argument to --server-num

**-s, --server-args** _ARGS_
> Arguments passed to Xvfb server (default: "-screen 0 640x480x8")

**-n, --server-num** _NUM_
> Use specified server number (default: 99)

**-e, --error-file** _FILE_
> Store output from xauth and Xvfb in file (default: /dev/null)

**-f, --auth-file** _FILE_
> Use specified X authority file

**-l, --listen-tcp**
> Enable TCP port listening in the X server (disabled by default for security)

**-p, --xauth-protocol** _PROTO_
> X authority protocol to use (default: MIT-MAGIC-COOKIE-1)

**-w, --wait** _DELAY_
> Wait delay seconds after launching Xvfb before starting the command (default: 3)

**-h, --help**
> Display usage information and exit

# DESCRIPTION

**xvfb-run** runs a command in a virtual X server environment using Xvfb (X Virtual Frame Buffer). This allows running graphical applications on systems without a display.

The tool is useful for automated testing, CI/CD pipelines, and headless server environments.

# CAVEATS

Xvfb must be installed. Some applications may behave differently in virtual X. Performance may vary for GPU-intensive applications.

# SEE ALSO

[xvfb](/man/xvfb)(1), [xinit](/man/xinit)(1), [xauth](/man/xauth)(1)
