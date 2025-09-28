Memento Pattern – Text Editor Undo

Problem Statement:
In a text editor, users often need an undo button. Without storing past states, it’s hard to go back to a previous version of the text.

Solution:
The Memento Pattern stores snapshots of an object’s state.

Memento holds the saved state (e.g., old text).

Originator (the editor) can create and restore states.

Caretaker manages the history of mementos (undo/redo list).

This allows easy rollback to previous versions without exposing internal details.