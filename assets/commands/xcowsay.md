# TAGLINE

Graphical desktop cow message display

# TLDR

Display cow with **message**

```xcowsay "[hello, world]"```

Display with **pipe** input

```ls | xcowsay```

Display at **position**

```xcowsay --at [X],[Y]```

Change cow **size**

```xcowsay --cow-size [small|med|large]```

Display **thought** bubble

```xcowsay --think```

Use custom **image**

```xcowsay --image [path/to/file]```

# SYNOPSIS

**xcowsay** [_OPTIONS_] [_MESSAGE_]

# PARAMETERS

**--at** _X,Y_
> Display at specified coordinates

**--cow-size** _SIZE_
> Cow size: small, med, or large

**--think**
> Use thought bubble instead of speech

**--image** _FILE_
> Use custom image instead of cow

**--time** _SECONDS_
> Display duration

# DESCRIPTION

**xcowsay** displays a cute cow with a message on the Linux desktop. Similar to cowsay but with a graphical display. The cow disappears after a timeout or when clicked.

Messages can be provided as arguments or piped from other commands.

# CAVEATS

X11 only. Display time depends on message length unless specified. Custom images must be PNG format.

# SEE ALSO

[cowsay](/man/cowsay)(1), [notify-send](/man/notify-send)(1)
