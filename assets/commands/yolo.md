# TAGLINE

Ultralytics object detection and computer vision

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

**yolo** is the CLI for Ultralytics YOLOv8, a state-of-the-art computer vision framework. It provides commands for object detection, instance segmentation, and image classification tasks from the terminal.

The tool supports a complete workflow: **train** builds models from datasets, **val** evaluates model accuracy, **predict** runs inference on images or video, and **export** converts models to deployment formats like ONNX and TensorRT. The **track** mode performs multi-object tracking on video streams.

Each command accepts a task type (detect, segment, classify) and a mode. Pre-trained models can be used directly for inference, or fine-tuned on custom datasets. GPU acceleration is supported through PyTorch for real-time performance.

# CAVEATS

Python/PyTorch required. GPU recommended. Model download.

# HISTORY

**yolo** CLI is part of **Ultralytics**, providing the YOLOv8 object detection and computer vision toolkit.

# SEE ALSO

[python](/man/python)(1), [pytorch](/man/pytorch)(1)
