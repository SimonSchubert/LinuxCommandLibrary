# TLDR

**Run detection**

```yolo detect predict model=[yolov8n.pt] source=[image.jpg]```

**Train model**

```yolo train data=[data.yaml] model=[yolov8n.pt] epochs=[100]```

**Validate model**

```yolo val model=[best.pt]```

**Export model**

```yolo export model=[best.pt] format=[onnx]```

**Track objects**

```yolo track source=[video.mp4] model=[yolov8n.pt]```

# SYNOPSIS

**yolo** _task_ _mode_ [_options_]

# PARAMETERS

**detect**
> Object detection.

**segment**
> Segmentation.

**classify**
> Classification.

**predict**
> Run inference.

**train**
> Train model.

**val**
> Validate model.

**export**
> Export format.

# DESCRIPTION

**yolo** runs Ultralytics YOLO. It does object detection.

Object detection. Find objects.

Segmentation. Pixel-level.

Classification. Categorize images.

Real-time. Fast inference.

# CAVEATS

Python/PyTorch required. GPU recommended. Model download.

# HISTORY

**yolo** CLI is part of **Ultralytics**, providing the YOLOv8 object detection and computer vision toolkit.

# SEE ALSO

[python](/man/python)(1), [pytorch](/man/pytorch)(1)
