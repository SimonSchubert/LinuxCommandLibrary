# TLDR

**Visualize current repo**

```gource```

**Visualize specific repo**

```gource [/path/to/repo]```

**Output video**

```gource -o - | ffmpeg -i - [output.mp4]```

**Set time scale**

```gource --seconds-per-day [0.1]```

**Hide filenames**

```gource --hide filenames```

# SYNOPSIS

**gource** [_options_] [_path_]

# PARAMETERS

_PATH_
> Repository path.

**-o** _FILE_
> Output to file (- for pipe).

**--seconds-per-day** _SEC_
> Speed of animation.

**--hide** _ELEMENTS_
> Hide elements.

**-s** _SEC_, **--start-date** _DATE_
> Start date.

**-f**, **--fullscreen**
> Fullscreen mode.

**--help**
> Display help information.

# DESCRIPTION

**gource** visualizes version control history as animated tree. Developers appear as avatars making changes, with files and directories branching from the center.

The tool creates compelling visualizations of project history. It supports Git, SVN, Mercurial, and Bazaar. Output can be piped to video encoders.

gource creates animated repository visualizations.

# CAVEATS

OpenGL required. Large repos may be slow. Customize for best results.

# HISTORY

gource was created by **Andrew Caudwell** to visualize software development history as engaging animations.

# SEE ALSO

[git-log](/man/git-log)(1), [ffmpeg](/man/ffmpeg)(1)
