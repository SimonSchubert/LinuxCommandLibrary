# TAGLINE

Lightweight Ruby HTML template compiler

# TLDR

**Convert a Slim template** to HTML

```slimrb [input.slim]```

**Read Slim from stdin** and output HTML

```echo "[h1 Hello]" | slimrb -s```

**Convert Slim to ERB** format

```slimrb -e [input.slim]```

**Output pretty-printed HTML** for debugging

```slimrb -p [input.slim]```

**Compile to Ruby code** without executing

```slimrb -c [input.slim]```

**Generate Rails-compatible code**

```slimrb --rails [input.slim]```

**Pass local variables** to the template

```slimrb -l "{name: 'World'}" [input.slim]```

**Load a Ruby library** before processing

```slimrb -r [library] [input.slim]```

# SYNOPSIS

**slimrb** [_options_] [_input_file_]

# PARAMETERS

**-s**, **--stdin**
> Read input from standard input instead of a file

**-c**, **--compile**
> Compile template to Ruby code without executing

**-e**, **--erb**
> Convert Slim template to ERB format

**--rails**
> Generate Rails-compatible code (implies --compile)

**-p**, **--pretty**
> Output pretty-printed HTML with indentation

**-r**, **--require** _library_
> Load a Ruby library or Slim plugin before processing

**-o**, **--option** _name=code_
> Set Slim engine options

**-l**, **--locals** _Hash|YAML|JSON_
> Pass local variables to the template

**--trace**
> Show full traceback on errors

**-v**, **--version**
> Display version information

**-h**, **--help**
> Show help message

# DESCRIPTION

**slimrb** is the command-line tool for the Slim template language. Slim is a lightweight Ruby templating engine that reduces HTML syntax to essential parts while maintaining readability. It uses indentation for nesting, eliminating the need for closing tags.

Slim syntax is concise: **div.container** becomes **\<div class="container"\>**, and **h1= title** outputs the value of **title** in an h1 tag. Attributes use parentheses: **a(href=url) Link**.

The tool can render templates to HTML, convert them to ERB for use in other contexts, or compile them to raw Ruby code for inspection. The **--pretty** option is useful for debugging, producing formatted HTML output.

Slim integrates with Rails, Sinatra, and any Rack-based framework through Tilt. It is one of the fastest Ruby template engines, comparable to Erubis in production mode.

# CAVEATS

Slim requires Ruby to be installed. Template syntax is whitespace-sensitive; mixing tabs and spaces can cause unexpected results. Some advanced Ruby expressions may need explicit output markers.

# HISTORY

**Slim** was created by **Andrew Stone**, **Fred Wu**, and **Daniel Mendler** around **2010** as a cleaner alternative to ERB and Haml. The project aimed to provide minimal syntax while maintaining full Ruby integration. It uses the Temple framework for parsing and compilation.

# SEE ALSO

[erb](/man/erb)(1), [haml](/man/haml)(1), [pug](/man/pug)(1), [ruby](/man/ruby)(1)
