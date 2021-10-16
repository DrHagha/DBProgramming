package view;

import persistence.dto.BoardDTO;

import java.util.List;

public class BoardView {
    public void printAll(List<BoardDTO> dtos){
        System.out.println("every content");
        for(BoardDTO dto:dtos){
            System.out.println("dto.toString() = " + dto.toString());
        }
    }
}
