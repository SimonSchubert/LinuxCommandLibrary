# TLDR

**Run pipes animation**

```pipes.sh```

**Set pipe count**

```pipes.sh -p [5]```

**Set frame rate**

```pipes.sh -f [60]```

**Random colors**

```pipes.sh -c [1]```

**Set pipe types**

```pipes.sh -t [0]```

**No bold colors**

```pipes.sh -B```

**Reset screen**

```pipes.sh -r [2000]```

# SYNOPSIS

**pipes.sh** [_-p n_] [_-f fps_] [_-c mode_] [_-t type_] [_options_]

# PARAMETERS

**-p** _N_
> Number of pipes.

**-f** _FPS_
> Target frame rate.

**-c** _MODE_
> Color mode.

**-t** _TYPE_
> Pipe character set.

**-r** _N_
> Reset after N characters.

**-R**
> Random starting point.

**-B**
> No bold.

**-h**
> Show help.

# DESCRIPTION

**pipes.sh** displays animated pipes in the terminal. It's a classic screensaver-style animation.

Pipes grow from edges and turn randomly. Multiple pipes create complex patterns.

Color modes vary from monochrome to rainbow. Different character sets provide visual variety.

Frame rate controls animation speed. Higher values create smoother animation.

Reset clears screen periodically. This prevents excessive visual clutter.

# CAVEATS

CPU usage increases with pipe count. Terminal must support ANSI colors. Best in large terminals.

# HISTORY

**pipes.sh** is a bash implementation of the classic "pipes" screensaver effect. It has become a popular terminal entertainment and desktop decoration script.

# SEE ALSO

[cmatrix](/man/cmatrix)(1), [sl](/man/sl)(1), [asciiquarium](/man/asciiquarium)(1)
