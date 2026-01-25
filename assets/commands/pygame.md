# TLDR

**Install Pygame**

```pip install pygame```

**Run Pygame example**

```python -m pygame.examples.aliens```

**Check installation**

```python -c "import pygame; print(pygame.ver)"```

# SYNOPSIS

**pygame** Python library for game development

# DESCRIPTION

**Pygame** is a Python library for game development built on SDL. It provides modules for graphics, sound, input handling, and game logic, making it ideal for 2D games and multimedia applications.

# BASIC EXAMPLE

```python
import pygame

pygame.init()
screen = pygame.display.set_mode((800, 600))
pygame.display.set_caption("My Game")

running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    screen.fill((0, 0, 0))
    pygame.draw.circle(screen, (255, 0, 0), (400, 300), 50)
    pygame.display.flip()

pygame.quit()
```

# KEY MODULES

```python
pygame.display  # Window management
pygame.draw     # Shape drawing
pygame.image    # Load/save images
pygame.mixer    # Sound playback
pygame.font     # Text rendering
pygame.sprite   # Sprite groups
pygame.time     # Timing/FPS control
pygame.key      # Keyboard input
pygame.mouse    # Mouse input
```

# EXAMPLES

```bash
# List all examples
python -m pygame.examples

# Run specific example
python -m pygame.examples.chimp
python -m pygame.examples.aliens
```

# CAVEATS

2D focused. For 3D, consider PyOpenGL or Panda3D. SDL-based, good cross-platform support.

# HISTORY

Pygame was created by **Pete Shinners** in 2000 as a Python wrapper for SDL, enabling easy game development.

# SEE ALSO

[python](/man/python)(1), [sdl2](/man/sdl2)(3), [pyglet](/man/pyglet)(1)
