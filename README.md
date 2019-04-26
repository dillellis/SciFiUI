# SciFi UI Project

Name: Dillon Ellis

Student Number: C17322316

# Description of the assignment
This is my assigment for OOP. I decided for this assignment I would make an interface from a space ship, similar to ones you would see if a Sci Fi movie. I included a radar, a shield and two cannons to shoot bullets from.

# Instructions
There are two buttons on the screen. The Shield button is the icon on the control panel shaped like a shield, When you click on this the three circles rotating around the small spaceship on the left of the screen speed up. This makes it look like it is being enclosed by a shield. When it is clicked some text saying 'ON' appears beside the button. Once the button is clicked again the text will disappear and the circles return to the original speed.

The other button is the cross hairs on the control panel, this is used to shoot bullets from the cannons at the bottom corners of the screen. Once you click on this button a burst of bullets shoots from the cannons and stop once they reach the crosshair target at the center of the screen.

# How it works

## Bullet
This is the bullet class. It first translates it's x and y locations to the given co-ordinates in the bottom corners of the screen before drawing the circle for the bullet.

The update function is used to move the bullet across the screen. First, it uses the pVector forward to change the direction of the bullet. The x value is changed using the sine of the angle of rotation and changes the y value using the cosine of the angle of rotation. The bullet is then moved in the direction by using the add fuction to move the pVector pos by the pVector forward and the given speed.

After this I included two if statements. The first statement checks if the direction passed into the bullet is equal to 1. The 1 signifys that the bullet is being shot from the left. If the bullet is going to pass the crosshair target and enter the right side of the screen, the while loop changes the pos back to the corner and sets the speed to zero to stop it.
The second if statement checks if the direction is equal to 2. This shows it is being shot from the right. The while loop stops the bullet from passing the crosshair and entering the left side of the screen.

## Radar
This is the radar class. In render if first draws a background circle and each of the smaller circels contained within it all at the given position. Next it rotates a line around the center using the angle theta, the line is from the pVector pos to the edge of the circle x2, y2 which are updated by adding and subtracting the sine and cosine of the angle.
In update the value of theta is incremented by two pi (the full circle) mulitplied by by a value timeDelta and the given frequency of the rotation.

##

# What I am most proud of in the assignment

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

