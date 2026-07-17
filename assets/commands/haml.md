# TAGLINE

templating language that compiles to HTML

# TLDR

**Render a Haml file to HTML** (prints to stdout)

```haml render [input.haml]```

**Render and save the result to a file**

```haml render [input.haml] > [output.html]```

**Render from stdin**

```cat [input.haml] | haml render -```

**Show the compiled Ruby source** instead of evaluating it

```haml compile [input.haml]```

**Check Haml syntax** without evaluating

```haml compile --check [input.haml]```

**Show the parsed syntax tree**

```haml parse [input.haml]```

**Display the installed Haml version**

```haml version```

# SYNOPSIS

**haml** _command_ [_options_] _file_

# PARAMETERS

**render** _file_
> Render the Haml template and print the resulting HTML to stdout. Use **-** to read from stdin.

**compile** _file_
> Print the compiled Ruby source for the template instead of evaluating it.

**-c**, **--check**
> With **compile**, only parse and validate the generated Ruby; print "Syntax OK" or the error instead of the source.

**temple** _file_
> Print the intermediate Temple expression used to generate the Ruby code.

**parse** _file_
> Print the parsed abstract syntax tree.

**version**
> Print the installed Haml version.

**-r**, **--require** _file_
> Require a Ruby library before rendering (render command only).

**-I**, **--load-path** _path_
> Add a directory to Ruby's load path (render command only).

**--no-escape-html**
> Disable automatic escaping of `=` output (escaping is on by default).

**--no-escape-attrs**
> Disable automatic escaping of attribute values (escaping is on by default).

# DESCRIPTION

**HAML** (HTML Abstraction Markup Language) is a templating language that compiles to HTML. It uses indentation for nesting and provides a concise syntax for HTML elements, attributes, and embedded Ruby.

Since Haml 6, the engine is built on Temple and the `haml` executable is a subcommand-based CLI (render, compile, temple, parse, version) rather than a single set of flags.

HAML is commonly used in Ruby on Rails applications, via the separate `haml-rails` gem, but can be used standalone for any HTML generation.

# HAML SYNTAX

```haml
%html
  %head
    %title My Page
  %body
    %h1 Hello World
    %p.intro Welcome!
    #content
      %ul
        - items.each do |item|
          %li= item
```

# CAVEATS

Requires Ruby. Whitespace-sensitive; indentation errors cause failures. The CLI's subcommands (render, compile, temple, parse) replaced the older single-invocation `haml input output` style and flags like `--rails` or `--style` in Haml 6; scripts written for Haml 3/4/5 need updating.

# HISTORY

HAML was created by **Hampton Catlin** in **2006** as part of the Ruby ecosystem. Haml 6 (2022) replaced the original hand-written compiler with one built on Temple, rewrote the CLI around Thor subcommands, and dropped the html4/xhtml output format options.

# SEE ALSO

[erb](/man/erb)(1), [slim](/man/slim)(1), [pug](/man/pug)(1)

# RESOURCES

```[Source code](https://github.com/haml/haml)```

```[Homepage](https://haml.info/)```

```[Documentation](https://haml.info/docs.html)```

<!-- verified: 2026-07-17 -->
