# TLDR

Generate a **coverage report** named file.cpp.gcov

```gcov [path/to/file.cpp]```

Write individual execution counts for every **basic block**

```gcov -a [path/to/file.cpp]```

Write **branch frequencies** to output and print summary as percentage

```gcov -b [path/to/file.cpp]```

Write branch frequencies as **number of branches taken**

```gcov -c [path/to/file.cpp]```

Do not create a **gcov output file**

```gcov -n [path/to/file.cpp]```

Write file level and **function level summaries**

```gcov -f [path/to/file.cpp]```

# SYNOPSIS

**gcov** [_options_] _source-files_

# PARAMETERS

**-a**, **--all-blocks**
> Write individual execution counts for every basic block

**-b**, **--branch-probabilities**
> Write branch frequencies to output file as percentages

**-c**, **--branch-counts**
> Write branch frequencies as counts rather than percentages

**-f**, **--function-summaries**
> Output summaries for each function in addition to file summary

**-n**, **--no-output**
> Do not create gcov output file

**-l**, **--long-file-names**
> Use long file names for output files

**-p**, **--preserve-paths**
> Preserve complete path information in output file names

**-o**, **--object-directory** _DIR_
> Search for object files in _DIR_

**-s**, **--source-prefix** _PREFIX_
> Remove source path prefix for shorter output names

# DESCRIPTION

**gcov** is a test coverage program used with GCC to analyze which parts of a program have been executed during testing. It helps identify untested code paths, improving test suite completeness.

To use gcov, compile your program with **-fprofile-arcs -ftest-coverage** (or **--coverage**). After running the program, gcov reads the generated .gcno and .gcda files to produce annotated source listings showing execution counts for each line.

Output files (*.gcov) contain the original source code annotated with execution counts. Lines marked **#####** were never executed. Branch information helps identify untested conditional paths.

# CAVEATS

Requires programs to be compiled with special GCC flags. Only works with GCC-compiled code. Running the program multiple times accumulates coverage data unless .gcda files are deleted between runs. Inline functions may show misleading counts.

# HISTORY

gcov has been part of the GNU Compiler Collection (GCC) since the early 1990s. It evolved alongside GCC's profiling capabilities and remains a fundamental tool for C/C++ code coverage analysis in the open-source ecosystem.

# SEE ALSO

[gcc](/man/gcc)(1), [lcov](/man/lcov)(1), [gprof](/man/gprof)(1)
