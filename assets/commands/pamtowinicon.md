# TAGLINE

converts PAM images to Windows ICO or CUR format

# TLDR

**Convert PAM to Windows icon**

```pamtowinicon [input.pam] > [output.ico]```

**Create cursor with hotspot**

```pamtowinicon -xhotspot [16] -yhotspot [16] [input.pam] > [output.cur]```

# SYNOPSIS

**pamtowinicon** [_options_] [_file_]

# PARAMETERS

**-xhotspot** _n_
> X coordinate of cursor hotspot.

**-yhotspot** _n_
> Y coordinate of cursor hotspot.

**-truetransparent**
> Use true transparency instead of color key.

# DESCRIPTION

**pamtowinicon** converts PAM images to Windows ICO (icon) or CUR (cursor) format. Supports multiple sizes in one file and transparency. Part of Netpbm toolkit.

# SEE ALSO

[winicontopam](/man/winicontopam)(1), [ppmtowinicon](/man/ppmtowinicon)(1)

