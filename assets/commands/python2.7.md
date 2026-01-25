# TLDR

**Run Python 2.7 script**

```python2.7 [script.py]```

**Interactive mode**

```python2.7```

**Execute command**

```python2.7 -c "[print 'hello']"```

**Run module**

```python2.7 -m [module]```

# SYNOPSIS

**python2.7** [_options_] [_script_] [_args_]

# PARAMETERS

**-c** _command_
> Execute command.

**-m** _module_
> Run library module.

**-i**
> Interactive after script.

**-u**
> Unbuffered I/O.

**-O**
> Optimize bytecode.

**-v**
> Verbose imports.

**-V**
> Print version.

# DESCRIPTION

**python2.7** is the Python 2.7 interpreter. Python 2 reached end-of-life on January 1, 2020, and should only be used for legacy code maintenance.

Use Python 3 for all new development.

# EXAMPLES

```bash
# Run script
python2.7 legacy_script.py

# Check version
python2.7 --version

# One-liner (note print statement)
python2.7 -c "print 'Hello, Python 2'"

# Install pip for Python 2
python2.7 -m ensurepip
```

# KEY DIFFERENCES FROM PYTHON 3

```python
# Python 2 syntax
print "hello"              # Statement
raw_input("Name: ")        # User input
unicode_string = u"text"   # Unicode prefix
5 / 2 == 2                 # Integer division
```

# CAVEATS

Python 2 is EOL and receives no updates. Security vulnerabilities unfixed. Migrate to Python 3.

# HISTORY

Python 2.0 was released in 2000. Python 2.7 was the final 2.x release (2010), with support ending January 1, 2020.

# SEE ALSO

[python3](/man/python3)(1), [2to3](/man/2to3)(1), [pip](/man/pip)(1)
