# TAGLINE

Terminal-based markdown presentation tool

# TLDR

**Start a presentation** from a markdown file

```slides [presentation.md]```

**Start with a specific slide**

```slides [presentation.md] --slide [3]```

**Serve a presentation** over SSH

```slides serve [presentation.md]```

**Execute code blocks** during presentation

```slides [presentation.md]```
> Press **Ctrl+E** on a slide with a code block to execute it

# SYNOPSIS

**slides** [_options_] [_file_]

**slides** **serve** [_file_]

# PARAMETERS

**--slide** _N_
> Start the presentation at slide number N.

**--theme** _theme_
> Use a specific theme for the presentation.

**serve**
> Host the presentation over SSH, allowing remote viewing.

# NAVIGATION

**h**, **Left**, **Page Up**, **Backspace**
> Go to previous slide.

**l**, **Right**, **Page Down**, **Space**, **Enter**
> Go to next slide.

**g**, **Home**
> Jump to first slide.

**G**, **End**
> Jump to last slide.

**1**-**9**
> Jump to slide number N.

**/**
> Search slides (supports regex, use /i for case-insensitive).

**Ctrl+E**
> Execute code block on current slide.

**q**, **Ctrl+C**
> Quit the presentation.

# DESCRIPTION

**slides** is a terminal-based presentation tool that renders Markdown files as slideshows. Slides are separated by horizontal rules (**---**) in the Markdown file. It supports syntax highlighting for code blocks, dynamic content, and live code execution.

The tool automatically watches for changes in the source file and updates the presentation in real-time, making it ideal for iterative development of presentations. Code blocks can be executed directly during the presentation by pressing **Ctrl+E**, displaying the output inline.

slides can also serve presentations over SSH using the **serve** subcommand, allowing audience members to follow along from their own terminals.

# CAVEATS

Requires a terminal that supports ANSI escape codes for proper rendering. Code execution runs commands in your local environment, so use caution with untrusted presentation files. The presentation appearance depends on terminal capabilities and font support.

# HISTORY

**slides** was created by Maas Lalani as an open-source terminal presentation tool written in Go. It was designed to provide a simple, distraction-free way to give presentations directly from the terminal using familiar Markdown syntax. The project gained popularity among developers who prefer terminal-based workflows and live coding demonstrations.

# SEE ALSO

[mdp](/man/mdp)(1), [patat](/man/patat)(1), [presenterm](/man/presenterm)(1), [tpp](/man/tpp)(1)
