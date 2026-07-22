# TAGLINE

Qt-based scientific 2D plotting tool (Grace reimplementation)

# TLDR

**Plot** one or more data files (first two columns as X Y)

```qtgrace [path/to/file1.dat] [path/to/file2.dat]```

Plot **all columns** as X Y1 Y2 ... with **-nxy**

```qtgrace -nxy [path/to/file.dat]```

Plot with a **logarithmic** x-axis

```qtgrace -log x [path/to/file.dat]```

Plot as **X Y DY** with log scales on both axes

```qtgrace -log xy -settype xydy [path/to/file.dat]```

**Show help**

```qtgrace -help```

# SYNOPSIS

**qtgrace** [_options_] [_datafile_...]

# DESCRIPTION

**qtgrace** is a Qt reimplementation of **Grace** (xmgrace), a WYSIWYG tool for displaying, analyzing, and preparing two-dimensional scientific plots. It shares much of Grace's command-line interface for non-interactive and scripted plotting.

Data files are typically whitespace-separated columns. Options control axis scales, set types (for example **xydy** for data with error bars), multi-column layouts, and batch output. The GUI provides interactive editing; the CLI is useful for reproducible plots from scripts.

# PARAMETERS

**-nxy** _file_
> Plot all columns of _file_ as X Y1 Y2 ...

**-log** _x_|_y_|_xy_
> Use a logarithmic scale on the specified axis or both

**-settype** _type_
> Data set type (for example **xy**, **xydy**)

**-help**
> Display help and exit

# HISTORY

**Grace** originated as a continuation of ACE/gr for scientific plotting. **QtGrace** ports the Grace interface to the Qt toolkit for native Windows, macOS, and Linux builds while keeping compatible CLI options.

# INSTALL

```aur: yay -S qtgrace```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gnuplot](/man/gnuplot)(1), [matplotlib](/man/matplotlib)(1)

# RESOURCES

```[Homepage](https://sourceforge.net/projects/qtgrace/)```

```[Documentation](https://plasma-gate.weizmann.ac.il/Grace/)```

<!-- verified: 2026-07-14 -->
