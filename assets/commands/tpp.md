# TAGLINE

Terminal-based text presentations

# TLDR

**Run a presentation**

```tpp [presentation.tpp]```

**Convert a presentation** to LaTeX

```tpp -l [output.tex] [presentation.tpp]```

**Show help information**

```tpp --help```

**Show version**

```tpp --version```

# SYNOPSIS

**tpp** [**-l** _output_] [_file.tpp_]

# PARAMETERS

**-l** _output_
> Convert presentation to LaTeX format and write to output file

**--help**
> Display help information

**--version**
> Display version number

# DESCRIPTION

**tpp** (Text Presentation Program) is an ncurses-based tool for creating and displaying presentations in the terminal. Presentations are written in a simple markup format and can run on any terminal that supports ncurses.

Presentations consist of pages separated by **--newpage**. Text before the first page marker serves as the abstract. Formatting commands include **--heading** for titles, **--center** for centered text, and **--boldon**/**--boldoff** for bold text.

Special features include **--huge** text using FIGlet, shell command output with **--beginshelloutput**/**--endshelloutput**, and simulated typing for demonstrations. Colors are supported with **--color** followed by a color name.

The tool supports animated text effects and real-time command execution, making it suitable for technical presentations and demos directly in the terminal.

# NAVIGATION

**Space**, **Right**, **Down**
> Next page

**b**, **Left**, **Up**
> Previous page

**j/J**
> Jump to specific page

**s/S**
> Jump to start

**e/E**
> Jump to end

**l/L**
> Reload current file

**c/C**
> Open command line

**q/Q**
> Quit

**?/h**
> Show help

# PRESENTATION FORMAT

```
--author Your Name
--title My Presentation
--date today

--newpage
--heading Introduction
--center Welcome to my talk
This is regular text.

--newpage
--heading Code Example
--beginshelloutput
$ ls -la
--endshelloutput
```

# CAVEATS

tpp requires a terminal with ncurses support. The **--huge** feature requires FIGlet to be installed. Complex presentations with many effects may not display correctly on minimal terminals.

# HISTORY

**tpp** was written by **Andreas Krennmair** and **Nico Golde**. It was designed to enable presentations directly in the terminal, appealing to users who prefer text-based tools and want to avoid graphical presentation software. The tool gained popularity in the Linux community for technical talks and demonstrations.

# SEE ALSO

[figlet](/man/figlet)(6), [cowsay](/man/cowsay)(1), [slides](/man/slides)(1), [mdp](/man/mdp)(1)
