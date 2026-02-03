# TLDR

**Compare two GIF files**

```gifdiff [file1.gif] [file2.gif]```

**Output differences**

```gifdiff -o [diff.gif] [file1.gif] [file2.gif]```

**Brief output**

```gifdiff -b [file1.gif] [file2.gif]```

# SYNOPSIS

**gifdiff** [_options_] _gif1_ _gif2_

# PARAMETERS

**-o** _file_
> Output difference image.

**-b**
> Brief output.

**-w**
> Ignore whitespace.

# DESCRIPTION

**gifdiff** compares two GIF images and reports differences. Can output a visual difference image showing which pixels differ.

# SEE ALSO

[gifsicle](/man/gifsicle)(1)

