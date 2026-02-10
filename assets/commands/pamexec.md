# TAGLINE

runs a specified shell command on each image in a multi-image PAM stream

# TLDR

**Apply command to each image in stream**

```pamexec "[pnmflip -lr]" [input.pam] > [output.pam]```

# SYNOPSIS

**pamexec** _command_ [_file_]

# PARAMETERS

_command_
> Shell command to execute on each image.

# DESCRIPTION

**pamexec** runs a specified shell command on each image in a multi-image PAM stream. The command receives each image on stdin and outputs to stdout. Part of Netpbm toolkit.

# SEE ALSO

[pamsplit](/man/pamsplit)(1), [pamcat](/man/pamcat)(1)

