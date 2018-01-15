/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elevatorsim.command;

import edu.elevatorsim.model.elevator.Elevator;
import edu.elevatorsim.model.floor.Floor;
import edu.elevatorsim.model.interfaces.DrawCommand;
import edu.elevatorsim.output.BuildingVisualization;


public class DrawGetOutElevator implements DrawCommand{
    
    private Elevator elevator;
    private Floor floor;
    private BuildingVisualization building;
    
    public DrawGetOutElevator(Elevator elevator, Floor floor, BuildingVisualization building){
        this.elevator = elevator;
        this.floor = floor;
        this.building = building;
    }

    @Override
    public void execute() {
        building.addArrivedPassengers(floor.getLevel(), floor.getArrivedPassenger().size());
        building.addPassengersInElevator(elevator.getId(), elevator.getPassengerCount());
    }

    @Override
    public Elevator getElevator() {
        return elevator;
    }

    @Override
    public Floor getFloor() {
        return floor;
    }
    
}
