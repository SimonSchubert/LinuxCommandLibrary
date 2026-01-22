# TLDR

**List all available tasks**

```rake -T```

**Run the default task**

```rake```

**Run a specific task**

```rake [task_name]```

**Run a task in a namespace**

```rake [namespace]:[task_name]```

**Run multiple tasks**

```rake [task1] [task2]```

**Run a task with arguments**

```rake [task_name][[arg1],[arg2]]```

**Run with verbose output** and full backtrace

```rake --trace [task_name]```

**Run tasks in parallel**

```rake -m [task_name]```

# SYNOPSIS

**rake** [**-f** _rakefile_] [**-T**] [**-t**] [**-v**] [**-j** _num_jobs_] [_task_...]

# PARAMETERS

**-T**, **--tasks** [_pattern_]
> Display available tasks with descriptions, optionally filtered by pattern

**-f**, **--rakefile** _FILE_
> Use specified file as the Rakefile

**-t**, **--trace**
> Turn on invoke/execute tracing and enable full backtrace

**-v**, **--verbose**
> Log messages to standard output

**-q**, **--quiet**
> Do not log messages to standard output

**-m**, **--multitask**
> Treat all tasks as multitasks (parallel execution)

**-j**, **--jobs** _NUM_
> Maximum number of parallel tasks (default: CPU cores + 4)

**-B**, **--build-all**
> Build all prerequisites, including those up-to-date

**-n**, **--dry-run**
> Do a dry run without executing actions

**-N**, **--no-search**
> Do not search parent directories for the Rakefile

**-P**, **--prereqs**
> Display tasks and their prerequisites

**-D**, **--describe** [_pattern_]
> Describe tasks (show full descriptions)

**-W**, **--where** [_pattern_]
> Show where tasks are defined

**-h**, **--help**
> Display help message

# DESCRIPTION

**rake** is Ruby's make-like build utility. It executes tasks defined in a Rakefile using standard Ruby syntax, eliminating the need for specialized Makefile syntax or XML configuration.

Tasks are defined with dependencies, and Rake automatically determines the correct execution order. The tool supports namespacing for organizing related tasks, file tasks that track modification times, and parallel execution for improved performance.

Rake is included in Ruby's standard library since version 1.9 and is widely used in Ruby projects, especially Rails applications where it handles database migrations, asset compilation, and other development tasks.

# CAVEATS

Rake searches for a Rakefile in the current directory and parent directories by default. Use **-N** to disable this behavior or **-f** to specify an explicit path.

Task names with special characters may require quoting in the shell. Arguments to tasks use bracket syntax which may also need escaping.

Parallel task execution (**-m**, **-j**) requires tasks to be thread-safe. Shared state between parallel tasks can cause race conditions.

# HISTORY

Rake was created by **Jim Weirich** in **2003** as a Ruby alternative to Make. The name stands for "Ruby Make." It was included in Ruby's standard library starting with version 1.9 in 2007. After Weirich's passing in 2014, the project continues to be maintained by the Ruby community.

# SEE ALSO

[make](/man/make)(1), [ruby](/man/ruby)(1), [bundle](/man/bundle)(1), [rails](/man/rails)(1)
