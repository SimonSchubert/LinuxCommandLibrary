# TLDR

**Launch Processing IDE**

```processing```

**Run sketch from command line**

```processing-java --sketch=[path/to/sketch] --run```

**Export as application**

```processing-java --sketch=[path] --export```

**Build without running**

```processing-java --sketch=[path] --build```

# SYNOPSIS

**processing** [_options_]

**processing-java** [_options_] **--sketch=**_path_

# PARAMETERS

**--run**
> Run the sketch.

**--build**
> Build without running.

**--export**
> Export as application.

**--present**
> Run in presentation mode.

**--platform** _os_
> Target platform.

**--output** _dir_
> Output directory.

# DESCRIPTION

**Processing** is a visual programming language and IDE for learning to code in the context of visual arts. It simplifies Java for creative coding.

# EXAMPLES

```bash
# Launch IDE
processing

# Run sketch
processing-java --sketch=/path/to/sketch --run

# Export for all platforms
processing-java --sketch=/path/to/sketch --export

# Build only
processing-java --sketch=/path/to/sketch --build
```

# SKETCH EXAMPLE

```java
void setup() {
  size(400, 400);
}

void draw() {
  background(255);
  ellipse(mouseX, mouseY, 50, 50);
}
```

# CAVEATS

Requires Java. IDE-focused workflow. Sketches are in ~/sketchbook by default.

# HISTORY

Processing was created by **Casey Reas** and **Ben Fry** at MIT Media Lab in 2001 for teaching programming in visual context.

# SEE ALSO

[p5](/man/p5)(1), [openframeworks](/man/openframeworks)(1), [java](/man/java)(1)
