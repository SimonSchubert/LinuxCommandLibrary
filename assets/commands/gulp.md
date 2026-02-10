# TAGLINE

JavaScript task runner for automating development workflows

# TLDR

**Run default task**

```gulp```

**Run specific task**

```gulp [taskname]```

**List available tasks**

```gulp --tasks```

**Run with custom gulpfile**

```gulp --gulpfile [path/gulpfile.js]```

**Run in silent mode**

```gulp --silent```

**Watch for changes**

```gulp watch```

# SYNOPSIS

**gulp** [_options_] [_tasks_...]

# DESCRIPTION

**gulp** is a JavaScript task runner for automating development workflows. It streams files through processing pipelines, handling tasks like compilation, minification, and testing.

The tool uses code-over-configuration with a gulpfile.js defining tasks as JavaScript functions. Its streaming architecture makes it efficient for file processing.

# PARAMETERS

**--tasks**, **-T**
> List available tasks.

**--gulpfile** _path_
> Specify gulpfile location.

**--cwd** _dir_
> Set working directory.

**--silent**, **-S**
> Suppress output.

**--continue**
> Continue on errors.

**--log-level** _level_
> Logging level.

**--series**
> Run tasks in series.

**--parallel**
> Run tasks in parallel.

# CAVEATS

Requires Node.js and npm. Plugin ecosystem fragmented. Gulp 4 API differs from 3. Some plugins unmaintained.

# HISTORY

**gulp** was created by **Eric Schoffstall** and released in **2013** as an alternative to Grunt. Its streaming approach and code-based configuration appealed to developers. While newer bundlers have emerged, gulp remains popular for task automation.

# SEE ALSO

[npm](/man/npm)(1), [webpack](/man/webpack)(1), [grunt](/man/grunt)(1), [make](/man/make)(1)
