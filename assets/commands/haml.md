# TAGLINE

templating language that compiles to HTML

# TLDR

**Convert HAML to HTML**

```haml [input.haml] [output.html]```

**Convert from stdin**

```cat [input.haml] | haml```

**Use Rails mode**

```haml --rails [input.haml]```

**Pretty print output**

```haml -f [input.haml]```

**Check HAML syntax**

```haml -c [input.haml]```

# SYNOPSIS

**haml** [_options_] [_input_] [_output_]

# PARAMETERS

**-c**, **--check**
> Check syntax only.

**-f**, **--format** _format_
> Output format: html5, html4, xhtml.

**-e**, **--escape-html**
> Escape HTML by default.

**-r**, **--require** _file_
> Require Ruby library.

**--style** _style_
> Output style: nested, expanded, compact, compressed.

**-s**, **--stdin**
> Read from stdin.

**-t**, **--trace**
> Show full stack trace.

# DESCRIPTION

**HAML** (HTML Abstraction Markup Language) is a templating language that compiles to HTML. It uses indentation for nesting and provides a concise syntax for HTML elements, attributes, and embedded Ruby.

HAML is commonly used in Ruby on Rails applications but can be used standalone for any HTML generation.

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

Requires Ruby. Whitespace-sensitive; indentation errors cause failures. Learning curve for non-Ruby developers. Less readable for complex HTML.

# HISTORY

HAML was created by **Hampton Catlin** in **2006** as part of the Ruby ecosystem. It influenced many similar templating languages and remains popular in Rails development.

# SEE ALSO

[erb](/man/erb)(1), [slim](/man/slim)(1), [pug](/man/pug)(1)
