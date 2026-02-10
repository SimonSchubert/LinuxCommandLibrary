# TAGLINE

provides a shebang-capable scripting interface for R

# TLDR

**Run R expression**

```r -e "print('Hello')"```

**Run R script**

```r [script.R]```

**Install package**

```r -e "install.packages('[package]')"```

**Pipe data to R**

```echo "[1,2,3]" | r -e "sum(scan())"```

**Run with arguments**

```r [script.R] [arg1] [arg2]```

# SYNOPSIS

**r** [_options_] [_script_] [_args_...]

# PARAMETERS

**-e** _expr_
> Evaluate expression.

**-p**
> Print result.

**-l** _package_
> Load package.

**-i**
> Interactive mode.

**-n**
> No implicit printing.

**-t**
> Use temporary directory.

**-v**
> Verbose output.

# DESCRIPTION

**littler** (r) provides a shebang-capable scripting interface for R. It allows running R code from the command line and in scripts, making R more accessible for shell scripting and automation.

littler starts faster than R --vanilla by avoiding R's full initialization.

# SHEBANG USAGE

```r
#!/usr/bin/env r

args <- commandArgs(TRUE)
print(paste("Hello", args[1]))
```

# CAVEATS

Must be installed separately from R. The command 'r' may conflict with other tools. Package loading adds startup time.

# HISTORY

littler was created by **Dirk Eddelbuettel** and **Jeff Horner** in **2006** to provide a proper scripting interface for R.

# SEE ALSO

[R](/man/R)(1), [Rscript](/man/Rscript)(1), [rpy2](/man/rpy2)(1)
