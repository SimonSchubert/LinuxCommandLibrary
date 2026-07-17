# TAGLINE

JavaScript task runner for automating development workflows

# TLDR

**Run default task**

```gulp```

**Run specific task**

```gulp [taskname]```

**List available tasks**

```gulp --tasks```

**Run multiple tasks in series instead of parallel**

```gulp [task1] [task2] --series```

**Run with custom gulpfile**

```gulp --gulpfile [path/gulpfile.js]```

**Run in silent mode**

```gulp --silent```

**Watch for changes** (requires a "watch" task in the gulpfile)

```gulp watch```

# SYNOPSIS

**gulp** [_options_] [_tasks_...]

# DESCRIPTION

**gulp** is a JavaScript task runner for automating development workflows. It streams files through processing pipelines, handling tasks like compilation, minification, and testing.

The tool uses code-over-configuration with a gulpfile.js defining tasks as JavaScript functions. Its streaming architecture makes it efficient for file processing. Tasks listed on the CLI run concurrently (in parallel) by default, as if they were dependencies of a single task.

# PARAMETERS

**-T**, **--tasks**
> Print the task dependency tree for the loaded gulpfile.

**--tasks-simple**
> Print a plaintext list of tasks, useful for scripting.

**-f**, **--gulpfile** _path_
> Manually set the path of the gulpfile.

**--cwd** _dir_
> Manually set the working directory.

**-S**, **--silent**
> Suppress all gulp logging.

**--continue**
> Continue execution of tasks upon failure.

**-L**, **--log-level**
> Set the logging level; repeat to increase verbosity (e.g. -LL).

**--series**
> Run the tasks given on the CLI in series instead of parallel.

**--color**, **--no-color**
> Force enable or disable colored output.

**-v**, **--version**
> Print the global and local gulp versions.

# CAVEATS

Requires Node.js and npm. Plugin ecosystem fragmented. Gulp 4 API differs from 3. Some plugins unmaintained.

# HISTORY

**gulp** was created by **Eric Schoffstall** and released in **2013** as an alternative to Grunt. Its streaming approach and code-based configuration appealed to developers. While newer bundlers have emerged, gulp remains popular for task automation.

# SEE ALSO

[npm](/man/npm)(1), [webpack](/man/webpack)(1), [grunt](/man/grunt)(1), [make](/man/make)(1)

# RESOURCES

```[Homepage](https://gulpjs.com)```

```[Source code](https://github.com/gulpjs/gulp)```

```[Documentation](https://gulpjs.com/docs/en/getting-started/quick-start/)```

<!-- verified: 2026-07-17 -->
