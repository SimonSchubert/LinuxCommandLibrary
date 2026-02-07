# TAGLINE

fingerprint reader daemon

# TLDR

**Start fingerprint daemon**

```fprind```

**Run in foreground**

```fprind -f```

**Debug mode**

```fprind -d```

**Specify device**

```fprind --device [/dev/bus/usb/001/002]```

# SYNOPSIS

**fprind** [_options_]

# PARAMETERS

**-f**, **--foreground**
> Run in foreground.

**-d**, **--debug**
> Enable debug output.

**--device** _PATH_
> Fingerprint reader device.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**fprind** (fingerprint daemon) manages fingerprint reader devices for biometric authentication. It communicates with fingerprint hardware and provides enrollment and verification services.

The daemon interfaces with PAM for system authentication, allowing fingerprint login and sudo verification. It maintains enrolled fingerprint templates securely.

fprind supports various USB fingerprint readers through libfprint.

# CAVEATS

Requires supported hardware. Not all readers have Linux drivers. Security depends on implementation quality.

# HISTORY

fprind works with **libfprint** and fprintd to provide fingerprint authentication on Linux. The ecosystem enables biometric login across various Linux distributions.

# SEE ALSO

[fprintd](/man/fprintd)(1), [pam-fprint](/man/pam-fprint)(8)
