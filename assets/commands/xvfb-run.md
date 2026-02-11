# TAGLINE

Run commands in virtual X server

# TLDR

**Run** command in virtual X server

```xvfb-run [command]```

**Auto** select server number

```xvfb-run -a [command]```

Pass **server args**

```xvfb-run -s "-screen 0 1024x768x24" [command]```

# SYNOPSIS

**xvfb-run** [_OPTIONS_] _COMMAND_

# PARAMETERS

**-a, --auto-servernum**
> Try to find free server number automatically

**-s, --server-args** _ARGS_
> Arguments passed to Xvfb server

**-n, --server-num** _NUM_
> Use specified server number

**-e, --error-file** _FILE_
> Write Xvfb errors to file

**-f, --auth-file** _FILE_
> Use specified auth file

# DESCRIPTION

**xvfb-run** runs a command in a virtual X server environment using Xvfb (X Virtual Frame Buffer). This allows running graphical applications on systems without a display.

The tool is useful for automated testing, CI/CD pipelines, and headless server environments.

# CAVEATS

Xvfb must be installed. Some applications may behave differently in virtual X. Performance may vary for GPU-intensive applications.

# SEE ALSO

[Xvfb](/man/Xvfb)(1), [xinit](/man/xinit)(1)
