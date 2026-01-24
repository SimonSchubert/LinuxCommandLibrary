# TLDR

**Start MATLAB**

```matlab```

**Start without GUI** (command line)

```matlab -nodesktop```

**Run script and exit**

```matlab -batch "[script_name]"```

**Run with specific startup file**

```matlab -r "[startup_commands]"```

**Start without splash screen**

```matlab -nosplash```

**Run script with arguments**

```matlab -batch "[myscript('[arg1]', '[arg2]')]"```

**Start with reduced memory**

```matlab -nojvm```

**Show version**

```matlab -help```

# SYNOPSIS

**matlab** [_-nodesktop_] [_-batch command_] [_-r command_] [_-nosplash_] [_options_]

# PARAMETERS

**-nodesktop**
> Start without desktop GUI.

**-nodisplay**
> Start without display (no figures).

**-nosplash**
> Skip splash screen.

**-nojvm**
> Start without Java (limited features).

**-batch** _COMMAND_
> Run command/script and exit.

**-r** _COMMAND_
> Run command on startup.

**-logfile** _FILE_
> Copy output to log file.

**-sd** _DIR_
> Set startup directory.

**-useStartupFolderPref**
> Use preference for startup folder.

**-singleCompThread**
> Limit to single thread.

**-help**
> Show help and version.

# DESCRIPTION

**matlab** launches MATLAB, a computing environment for numerical computation, visualization, and programming. It's widely used in engineering, science, and finance.

The desktop provides an integrated environment with editor, command window, workspace, and figure windows. No-desktop mode offers command-line interaction for scripts and automation.

Batch mode (-batch) executes commands and exits, suitable for automated workflows and scheduled jobs. It returns non-zero exit codes on errors, unlike -r which continues on errors.

Scripts (.m files) contain MATLAB code. Functions define reusable operations. The MATLAB path determines which files are accessible.

Without JVM (-nojvm), MATLAB uses less memory but loses desktop, figure windows, and some toolbox features. Useful for computation-only tasks on resource-limited systems.

# CAVEATS

Commercial license required. Large memory footprint. Startup time can be significant. Some toolboxes require additional licenses. Not all features work in nodesktop mode.

# HISTORY

**MATLAB** was created by **Cleve Moler** in the late **1970s** to provide students access to LINPACK and EISPACK without Fortran. **MathWorks** was founded in **1984** to commercialize it. MATLAB became the standard for numerical computing in academia and industry.

# SEE ALSO

[octave](/man/octave)(1), [python](/man/python)(1), [julia](/man/julia)(1), [r](/man/r)(1)
